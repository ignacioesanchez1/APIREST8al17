package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.BaseRepository;
import com.example.inicial1.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){  //cumple la misma funcion que @Autowired

        super(baseRepository);
    }
    @Override
    public List<Localidad> search(String filtro) throws Exception {
        try{
            //METODOS DE QUERY
            //List<Localidad> localidades= localidadRepository.findByDenominacionContaining(filtro);
            //QUERY CON JPQL
            //List<Localidad> localidades=localidadRepository.search(filtro);
            //QUERY NATIVAS CON SQL
            List<Localidad> localidades=localidadRepository.searchNativo(filtro);
            return localidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Localidad> search(String filtro, Pageable pageable) throws Exception {
        try{
            //METODOS DE QUERY
            //Page<Localidad> localidades= localidadRepository.findByDenominacionContaining(filtro, pageable);
            //QUERY CON JPQL
            //Page<Localidad> localidades=localidadRepository.search(filtro, pageable);
            //QUERY NATIVAS CON SQL
            Page<Localidad> localidades = localidadRepository.searchNativo(filtro, pageable);
            return localidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    }



