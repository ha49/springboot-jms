package com.example.jmsex.model;

import java.io.Serializable;

public class HelloMessage implements Serializable {

    private String message;

    public HelloMessage (String message){

        this.message=message;
    }
}
