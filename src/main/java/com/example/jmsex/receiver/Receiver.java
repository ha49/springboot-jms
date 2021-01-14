package com.example.jmsex.receiver;

import com.example.jmsex.model.HelloMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "our-queue")
    public void listen(@Payload HelloMessage helloMessage){
        System.out.println("a message received");
    }

}
