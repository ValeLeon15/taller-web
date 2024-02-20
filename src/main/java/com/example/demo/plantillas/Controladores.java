package com.example.demo.plantillas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plantillas")
public class Controladores {

    @GetMapping("/bienvenida")
    public String bienvenidaContro(){
        return"bienvenida";
    }

}
