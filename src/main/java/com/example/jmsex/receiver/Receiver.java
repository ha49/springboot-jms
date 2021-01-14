package com.example.jmsex.receiver;

import com.example.jmsex.config.JmsConfig;
import com.example.jmsex.model.MessageObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = JmsConfig.FLX_QUEUE)
    public void listen(@Payload MessageObject messageObject){
        System.out.println("a message received");
        System.out.println(messageObject);
    }

}
