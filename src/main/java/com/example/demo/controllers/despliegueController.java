

package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/grupo14/despliegue")
public class despliegueController {
 @GetMapping("/despliegueController ")
 public String despliegue(){
    return ("despliegue.html");
 }

}  