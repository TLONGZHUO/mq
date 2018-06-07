package com.francis.mq.listener;

import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.stereotype.Component;

@Component
public class ConfirmCallBackListener implements ConfirmCallback {
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("confirm--:correlationData:"+correlationData+",ack:"+ack+",cause:"+cause);
    }
}