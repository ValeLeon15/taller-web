package com.example.demo.plantillas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo14/plantillas")
public class Controladores {

    @GetMapping("/controladorAbout-us")
    public String controlador1(){
        return"about-us";
    }
    @GetMapping("/controladorArchitecture")
    public String controlador2(){
        return"architecture";
    }
    @GetMapping("/controladorDeployment")
    public String controladores3(){
        return"deployment";
    }

    @GetMapping("/controladorForDevelopment")
    public String controladores4(){
        return"for-development";
    }
    @GetMapping("/controladorForm")
    public String controladores5(){
        return"form";
    }

    @GetMapping("/controladorIndex")
    public String controladores6(){
        return"index";
    }

    @GetMapping("/controladorProject-description")
    public String controladores7(){
        return"project-description";
    }

    @GetMapping("/controladorRequirements")
    public String controladores8(){
        return"requirements";
    }

    @GetMapping("/controladorTests")
    public String controladores9(){
        return"tests";
    }

}