
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/grupo14/descripcionProyecto")
public class descripcionProyectoController {
 @GetMapping("/descripcionProyectoController ")
 public String descripcionProyecto(){
    return ("descripcionProyecto.html");
 }

}  