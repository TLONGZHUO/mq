package com.tlong.api;


import com.tlong.dto.UserDto;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient
@Api("swagger2测试接口")
public interface UserApi {

    @PostMapping("/test")
    @ApiOperation("测试接口")
    String test(@RequestParam String str);

    @PostMapping("/login")
    @ApiOperation("测试2")
    Boolean login(@RequestBody UserDto userDto);
}
