package com.example.inicial1.services;

import com.example.inicial1.entities.Persona;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){  //cumple la misma funcion que @Autowired

        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //METODOS DE QUERY
            //List<Persona> personas= personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //QUERY CON JPQL
            //List<Persona> personas=personaRepository.search(filtro);
            //QUERY NATIVAS CON SQL
            List<Persona> personas=personaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //METODOS DE QUERY
            //Page<Persona> personas= personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //QUERY CON JPQL
            //Page<Persona> personas=personaRepository.search(filtro, pageable);
            //QUERY NATIVAS CON SQL
            Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

