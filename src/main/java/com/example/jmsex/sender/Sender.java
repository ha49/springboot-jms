package com.example.jmsex.sender;

import com.example.jmsex.config.JmsConfig;
import com.example.jmsex.model.MessageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class Sender {

    private int counter=1;



    @Autowired
    JmsTemplate jmsTemplate;



    @Scheduled(fixedRate = 3000)
    public void sendMessage(){

        System.out.println("sending message " + counter);
        MessageObject messageObject =new MessageObject(
                UUID.randomUUID(),
                "Hello from FLX_QUEUE ..",
                LocalDateTime.now());

        jmsTemplate.convertAndSend(JmsConfig.FLX_QUEUE, messageObject);

        System.out.println("message - " + counter+ " sent");
//        System.out.println(messageObject);

        counter++;



    }
}
