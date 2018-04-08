package com.tlong.client;

import com.tlong.api.UserApi;
import com.tlong.client.fallback.UserApiFallBack;
import com.tlong.dto.UserDto;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "uaa",path = "/api/user",fallback = UserApiFallBack.class)
public class UserClient implements UserApi{
    @Override
    public String test(String str) {
        return null;
    }

    @Override
    public Boolean login(UserDto userDto) {
        return null;
    }
}
