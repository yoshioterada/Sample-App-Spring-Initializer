package com.yoshio3.sample-app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Say Hello World!";
    }
}

