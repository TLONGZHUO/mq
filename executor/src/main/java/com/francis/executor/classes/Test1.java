package com.francis.executor.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Test1 {

    @Autowired
    Service service;

    @GetMapping("/go")
    public void httptest(){
        service.httptest();
    }
}
