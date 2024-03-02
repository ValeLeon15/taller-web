package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo14/control")
public class paraDesarrolloController {

    @GetMapping("/paraDesarrollo")
    public String paraDesarrollo(){
        return ("paraDesarrollo.html");
    }
}
