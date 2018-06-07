package com.francis.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Queue;

@Component
@Transactional
public class Sender implements RabbitTemplate.ReturnCallback {

    @Autowired
    private RabbitTemplate  rabbitTemplate;

    public void send(){
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("test", context);
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("sender return success" + message.toString()+"==="+i+"==="+s1+"==="+s2);
    }
}
