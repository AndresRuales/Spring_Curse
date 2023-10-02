package com.HolaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model model) {
        //Informacion del salo del servidor, con log
        
        var mensaje = "Hola mundo con Thymeleaf";
        log.info("Ejecuntando el controlador  Spring MVC");
        //Llave, valor
        model.addAttribute("mensaje", mensaje);
        
        
        return "index";
    }
    
}
