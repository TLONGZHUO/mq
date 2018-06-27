package com.francis.executor.classes;

import com.francis.executor.api.LoginApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements LoginApi {

    @Autowired
    Service service;

    @Override
    @GetMapping("/login")
    public void login() {
        service.httptest();
    }
}
