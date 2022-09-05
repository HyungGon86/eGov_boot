package com.addone.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConTroller {

    @GetMapping("/home")
    public String home() {
        return "home";
    }


}
