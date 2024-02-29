package com.example.demo.plantillas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo14/plantillas")
public class Controladores {

    @GetMapping("/about-us")
    public String controlador1(){
        return"about-us";
    }
    @GetMapping("/architecture")
    public String controlador2(){
        return"architecture";
    }
    @GetMapping("/deployment")
    public String  controladores3(){
        
        return"deployment";
    }

    @GetMapping("/for-development")
    public String controladores4(){
        return"for-development";
    }
    @GetMapping("/form")
    public String controladores5(){
        return"form";
    }

    @GetMapping("/index")
    public String controladores6(){
        return"index";
    }

    @GetMapping("/project-description")
    public String controladores7(){
        return"project-description";
    }

    @GetMapping("/requirements")
    public String controladores8(){
        return"requirements";
    }

    @GetMapping("/test")
    public String controladores9(){
        return"test";
    }

}