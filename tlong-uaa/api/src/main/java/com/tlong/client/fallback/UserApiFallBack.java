package com.tlong.client.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserApiFallBack implements FallbackFactory<UserApiFallBack> {
    @Override
    public UserApiFallBack create(Throwable throwable) {
        return null;
    }
}
