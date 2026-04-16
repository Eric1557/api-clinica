package com.clinica.apiclinica.services;

import com.clinica.apiclinica.model.Consulta;
import com.clinica.apiclinica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public List<Consulta> buscarConsulta(){
        return consultaRepository.findAll();
        
    }



}
