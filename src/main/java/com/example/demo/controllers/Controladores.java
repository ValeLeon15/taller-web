package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/grupo14/controllers")
public class Controladores {


    @GetMapping("/presentacionEquipo")
    public String controlador1(){
        return "presentacionEquipo.html";
    }
    @GetMapping("/arquitectura")
    public String controlador2(){
        return"arquitectura.html";
    }
    @GetMapping("/despliegue")
    public String  controladores3(){
        
        return"despliegue.html";
    }

    @GetMapping("/paraDesarrollo")
    public String controladores4(){
        return"paraDesarrollo.html";
    }

    @GetMapping("/index")
    public String controladores6(){
        return"index.html";
    }

    @GetMapping("/descripcionProyecto")
    public ModelAndView controladores7(){
        return new ModelAndView ("descripcionProyecto");
    }

    @GetMapping("/requerimientos")
    public String controladores8(){
        return"requerimientos.html";
    }

    @GetMapping("/pruebas")
    public String controladores9(){
        return"pruebas.html";
    }

}