package com.HolaMundo;

import com.HolaMundo.domain.Persona;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    
    @GetMapping("/")
    public String inicio(Model model) {
        //Informacion del salo del servidor, con log
        
        var mensaje = "Hola mundo con Thymeleaf";
        var persona = new Persona();
        persona.setNombre("Daniel");
        persona.setApellido("Ruales");
        persona.setEmail("Daniel@ruales.com");
        persona.setTelefono("1453415");
        
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("Karla@rs.com");
        persona2.setTelefono("1453415");
        
        
        var personas = new ArrayList();
        personas.add(persona);
        personas.add(persona2);
        
        
        log.info("Ejecuntando el controlador  Spring MVC");
        //Llave, valor
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("persona", personas);
        
        
        return "index";
    }
    
}
