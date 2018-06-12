package com.francis.executor.classes;

import com.francis.api.client.LoginClient;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private final LoginClient loginClient;

    public Service(LoginClient loginClient) {
        this.loginClient = loginClient;
    }

    public void httptest(){
        loginClient.login();
        System.out.println("AAAAAA");
    }
}
