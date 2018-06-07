package com.francis.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {

    @Resource
    private Sender sender;

    @Test
    public void contextLoads() {
    }

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
