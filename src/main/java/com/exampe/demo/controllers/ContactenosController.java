package com.exampe.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/grupo14/controllers")
public class ContactenosController {
    @GetMapping("/grupo14/presentacionEquipo")
	public String losPipolSoloTexto() {
		return "presentacionEquipo.html";
	}
    
}
