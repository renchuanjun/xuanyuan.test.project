package org.open.utils;

import cn.com.fotic.cbs.edp.configuration.HTTPStatusCodeException;
import cn.com.fotic.cbs.edp.model.RequestMessage;
import cn.com.fotic.utils.FastJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClientUtils {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${system.tryTime}")
    private int tryTime;
    @Value("${system.timesNumber}")
    public int timesNumber;

    /**
     * @param url
     * @return 说明 :
     * @Retryable注解的方法在发生异常时会重试，参数说明 value：当指定异常发生时会进行重试 ,HttpClientErrorException是RestClientException的子类。
     * include：和value一样，默认空。如果 exclude也为空时，所有异常都重试
     * exclude：指定异常不重试，默认空。如果 include也为空时，所有异常都重试
     * maxAttemps：最大重试次数，默认3
     * backoff：重试等待策略，默认空
     * @Backoff注解为重试等待的策略，参数说明： delay：指定重试的延时时间，默认为1000毫秒
     * multiplier：指定延迟的倍数，比如设置delay=5000，multiplier=2时，第一次重试为5秒后，第二次为10(5x2)秒，第三次为20(10x2)秒。
     */
    @Retryable(value = Exception.class, maxAttemptsExpression = "${system.timesNumber}",
            backoff = @Backoff(delayExpression = "${system.tryTime}", multiplier = 1))
    public String doPost(RequestMessage requestMessage, String url) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        //定义请求参数类型，这里用json所以是MediaType.APPLICATION_JSON
        headers.setContentType(MediaType.APPLICATION_JSON);
        String content = FastJsonUtils.toJSONString(requestMessage);
        HttpEntity<String> request = new HttpEntity<>(content, headers);
        ResponseEntity<String> postForEntity = restTemplate.postForEntity(url, request, String.class);
        HttpStatus statusCode = postForEntity.getStatusCode();
        if (200 != statusCode.value()) {
            throw new HTTPStatusCodeException("响应状态为:" + statusCode.value());
        }
        String body = postForEntity.getBody();
        return body;
    }


}
