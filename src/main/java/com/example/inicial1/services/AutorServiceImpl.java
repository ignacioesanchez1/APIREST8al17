package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.repositories.AutorRepository;
import com.example.inicial1.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService{

       @Autowired
        private AutorRepository autorRepository;

        public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository){
            super(baseRepository);
        }

    @Override
    public List<Autor> search(String filtro) throws Exception {
        try{
            //METODOS DE QUERY
            //List<Autor> autores= autorRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //QUERY CON JPQL
            //List<Autor> autores=autorRepository.search(filtro);
            //QUERY NATIVAS CON SQL
            List<Autor> autores=autorRepository.searchNativo(filtro);
            return autores;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Autor> search(String filtro, Pageable pageable) throws Exception {
        try{
            //METODOS DE QUERY
            //Page<Autor> autores= autorRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //QUERY CON JPQL
            //Page<Autor> autores=autorRepository.search(filtro, pageable);
            //QUERY NATIVAS CON SQL
            Page<Autor> autores = autorRepository.searchNativo(filtro, pageable);
            return autores;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    }

