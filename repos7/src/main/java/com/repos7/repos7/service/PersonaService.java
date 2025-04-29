package com.repos7.repos7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personarepository;

    public Persona guardar(Persona persona)
        personarepository.create(persona);
        return persona;
    }
    
}
