package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Contacto;
import com.example.demo.service.IContactoService;

@Controller
@RequestMapping("/grupo14/formControl")
public class formularioController {
    @Autowired
    private IContactoService contactoService;

    @GetMapping("/form")
    public String controlador(){
        return"form.html";
    }
    @PostMapping("/submit")
    public String guardar(@ModelAttribute Contacto contacto){
        
        contactoService.guardar(contacto);

        return "form.html";
    }
}
