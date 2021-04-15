package com.BriKoner.RestFul.service;

import com.BriKoner.RestFul.entity.Persona;
import com.BriKoner.RestFul.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> list(){
        return personaRepository.findAll();
    }

    public void save(Persona persona){
        personaRepository.save(persona);
    }
}
