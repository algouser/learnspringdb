package com.springlearn.learnspringdb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    @GetMapping("/")
    public String returnHello(){
        return  "Alas ka bhau.. kasa ahes tu?";
    }
}
