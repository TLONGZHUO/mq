package com.francis.executor.client;

import com.francis.executor.api.LoginApi;
import com.francis.executor.fallback.ExecutorLoginClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "executor",fallback = ExecutorLoginClientFallback.class)
public interface ExecutorLoginClient extends LoginApi {
}
