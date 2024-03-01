
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/grupo14/index")
public class indexController {
 @GetMapping("/indexController")
 public String index(){
    return ("index.html");
 }

}     
