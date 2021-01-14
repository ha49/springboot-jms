package com.example.jmsex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JmsexApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsexApplication.class, args);
    }

    @RestController
    @RequestMapping("/")
  public class HelloController {

        @GetMapping
        public String getMessage(){
            return "Hello docker ";
        }

    }
}
