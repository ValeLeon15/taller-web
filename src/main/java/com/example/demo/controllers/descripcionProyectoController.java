
package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/grupo14/control")
public class descripcionProyectoController {

   @GetMapping("/descripcionProyecto")
   public String descripcionProyecto(){
      return ("descripcionProyecto.html");
   }

}  