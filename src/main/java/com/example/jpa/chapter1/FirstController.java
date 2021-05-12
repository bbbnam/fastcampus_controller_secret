package com.example.jpa.chapter1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {

    @RequestMapping(value = "/first-url", method = RequestMethod.GET)
    public void first() {

    }
}
