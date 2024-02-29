package com.example.demo.plantillas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Contacto;
import com.example.demo.service.IContactoService;

@Controller
@RequestMapping("/grupo14/controllers")
public class Controladores {

    
	@Autowired
    private IContactoService contactoService;


    @GetMapping("/about-us")
    public ModelAndView controlador1(){
        return new ModelAndView("about-us");
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
    public ModelAndView controladores7(){
        return new ModelAndView ("project-description");
    }

    @GetMapping("/requirements")
    public String controladores8(){
        return"requirements";
    }

    @GetMapping("/tests")
    public String controladores9(){
        return"tests";
    }

    @PostMapping("/submit")
    public String guardar(@ModelAttribute Contacto contacto){
        
        contactoService.guardar(contacto);

        return "redirect:/grupo14/controllers/form";
    }

}