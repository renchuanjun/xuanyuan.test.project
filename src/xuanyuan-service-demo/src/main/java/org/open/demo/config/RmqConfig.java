package org.open.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RmqConfig {
	
	/** *外部数据队列名称 */
	public static String EDP_DB_DATA ;
	/** * 外部数据消费者数量，默认10 */
	@Value("${edp.db.concurrent}")
	public  int EDP_CONCURRENT;
	/** * 外部数据每个消费者获取最大投递数量 默认50 */
	@Value("${edp.db.prefetch.count}")
	public  int EDP_PREFETCH_COUNT;

	@Value("${edp.db.bingjian.queue}")
	public  void setEDP_DB_DATA(String fEDP_DB_DATA) {
		RmqConfig.EDP_DB_DATA = fEDP_DB_DATA;
	}
	
	@Bean
	public Queue edpDBQueue() {
		return new Queue(EDP_DB_DATA);
	}

	// ===============以下是验证topic Exchange的队列==========
	@Bean
	public Queue queueMessage() {
		return new Queue("topic.message");
	}

	@Bean
	public Queue queueMessages() {
		return new Queue("topic.messages");
	}

	// ===============以上是验证topic Exchange的队列==========

	// ===============以下是验证Fanout Exchange的队列==========
	@Bean
	public Queue AMessage() {
		return new Queue("fanout.A");
	}

	@Bean
	public Queue BMessage() {
		return new Queue("fanout.B");
	}

	@Bean
	public Queue CMessage() {
		return new Queue("fanout.C");
	}

	// ===============以上是验证Fanout Exchange的队列==========

	@Bean
    TopicExchange exchange() {
		return new TopicExchange("exchange");
	}

	@Bean
    FanoutExchange fanoutExchange() {
		return new FanoutExchange("fanoutExchange");
	}

	/**
	 * 将队列topic.message与exchange绑定，binding_key为topic.message,就是完全匹配
	 * 
	 * @param queueMessage
	 * @param exchange
	 * @return
	 */
	@Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessage).to(exchange)
				.with("topic.message");
	}

	/**
	 * 将队列topic.messages与exchange绑定，binding_key为topic.#,模糊匹配
	 *
	 * @param exchange
	 * @return
	 */
	@Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
		return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
	}

	@Bean
    Binding bindingExchangeA(Queue AMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(AMessage).to(fanoutExchange);
	}

	@Bean
    Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(BMessage).to(fanoutExchange);
	}

	@Bean
    Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(CMessage).to(fanoutExchange);
	}

	/**
	 * 配置消费者并发与数量
	 * 
	 * @param configurer
	 * @param connectionFactory
	 * @return
	 */
	@Bean("pointTaskContainerFactory")
	public SimpleRabbitListenerContainerFactory pointTaskContainerFactory(
			SimpleRabbitListenerContainerFactoryConfigurer configurer, ConnectionFactory connectionFactory) {
		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
		factory.setPrefetchCount(EDP_PREFETCH_COUNT);
		factory.setConcurrentConsumers(EDP_CONCURRENT);
		configurer.configure(factory, connectionFactory);
		return factory;
	}
}
