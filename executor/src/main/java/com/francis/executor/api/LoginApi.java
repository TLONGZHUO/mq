package com.francis.executor.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface LoginApi {

    @GetMapping("/login")
    void login();
}
