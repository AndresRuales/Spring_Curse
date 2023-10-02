package com.HolaMundo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
        //Informacion del salo del servidor, con log
        log.info("Ejecuntando el controlador  Spring MVC");
        return "index";
    }
    
}
