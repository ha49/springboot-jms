package com.example.jmsex.sender;

import com.example.jmsex.model.HelloMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private int counter=1;


    @Autowired
    JmsTemplate jmsTemplate;



    @Scheduled(fixedRate = 3000)
    public void sendMessage(){

        System.out.println("sending message - " + counter);
        HelloMessage helloMessage=new HelloMessage("hello");

        jmsTemplate.convertAndSend("our-queue", helloMessage);

        System.out.println("message - " + counter+ " sent");
        System.out.println(helloMessage);

        counter++;



    }
}
