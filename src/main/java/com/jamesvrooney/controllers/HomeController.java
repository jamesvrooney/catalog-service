package com.jamesvrooney.controllers;

import com.jamesvrooney.config.PolarProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final PolarProperties polarProperties;

//    public HomeController(PolarProperties polarProperties) {
//        this.polarProperties = polarProperties;
//    }

    @GetMapping("/")
    public String getGreeting() {
        var greeting = polarProperties.getGreeting();

//        return "Welcome to the book catalog!";
        return greeting;
    }
}
