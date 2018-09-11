package org.open.tcc.feign;

import org.open.tcc.model.TransactionLocal;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author 任传君
 * @create 2018-09-10 12:07
 **/
@Component
public class TransactionHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    public TransactionHttpRequestInterceptor() {

    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] bytes, ClientHttpRequestExecution execution) throws IOException {
        String groupId = TransactionLocal.current() +"";
        System.out.println(groupId);
        return execution.execute(request, bytes);
    }
}
