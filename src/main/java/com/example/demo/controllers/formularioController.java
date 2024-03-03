package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Contacto;
import com.example.demo.repository.ContactoRepository;


@Controller
@RequestMapping("/grupo14/formControl")
public class formularioController {
    @Autowired
    private ContactoRepository contactoService;

    @GetMapping("/form")
    public String form(){
        return("form.html");
    }
    
    @PostMapping("/submit")
    public String guardar(@ModelAttribute Contacto contacto){
        
        try {
            contactoService.save(contacto);
            System.out.println("Se guardo el contacto con exito");
        } catch (Exception e) {
            
            System.out.println("Error guardando contacto");
        }

        return "form.html";
    }
}
