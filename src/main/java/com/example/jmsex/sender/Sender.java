package com.example.jmsex.sender;

import com.example.jmsex.model.HelloMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private int counter=1;




    @Scheduled(fixedRate = 3000)
    public void sendMessage(){

        System.out.println("sending message - " + counter++);
        HelloMessage helloMessage=new HelloMessage("hello");



    }
}
