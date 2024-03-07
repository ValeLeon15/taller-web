package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String guardar(@ModelAttribute Contacto contacto, Model model){
        String error="Hubo un error en los datos ingresados. El formulario no se envio";
        try {
            if(contacto.getNombre().isEmpty() || contacto.getApellido().isEmpty() || contacto.getCorreo().isEmpty() || contacto.getDescripcion().isEmpty())
            {
                model.addAttribute("error", error);
            }
            else if(contacto.getNombre().matches(".*\\d.*") == true || contacto.getApellido().matches(".*\\d.*") == true)
            {
                model.addAttribute("error", error);
            }
            else if(contacto.getCorreo().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") == false|| contacto.getCorreo().matches(".*[A-Z].*") == false)
            {
                model.addAttribute("error", error);

            } else{
                contactoService.save(contacto);
            }
        } catch (Exception e) {

        }
        return "form.html";
    }
}
