package com.repos7.repos7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/api/personas")
@RestController
public class PersonaController {
    
    @GetMapping
    public String saludar() {
        return "Wena ctm xd";
    }
    
    
    
}
