package com.francis.executor.fallback;

import com.francis.executor.client.ExecutorLoginClient;
import org.springframework.stereotype.Component;

@Component
public class ExecutorLoginClientFallback implements ExecutorLoginClient {

    @Override
    public void login() {
        System.out.println("访问失败熔断成功!");
    }
}
