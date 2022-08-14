package com.uniesp.aulas.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorld {

    @RequestMapping
    public String helloWorld() {
        return "Hello World";
    }
}
