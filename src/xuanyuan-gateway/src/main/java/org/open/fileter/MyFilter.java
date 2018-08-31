package org.open.fileter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author 任传君
 * @create 2018-08-30 14:42
 **/

//@Component 实现filter 双向过滤 与 构造方法不并存
public class MyFilter implements GlobalFilter, Ordered {
    //创建构造方法 实现fiter单项请求过滤
    public MyFilter() {
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        String token = exchange.getRequest().getQueryParams().getFirst("authToken");
//        //向headers中放文件，记得build
//        ServerHttpRequest host = exchange.getRequest().mutate().header("a", "888").build();
//        //将现在的request 变成 change对象
//        ServerWebExchange build = exchange.mutate().request(host).build();
        System.out.println("过滤器");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -200;
    }
}


