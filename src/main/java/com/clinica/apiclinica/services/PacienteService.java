package com.clinica.apiclinica.services;

import com.clinica.apiclinica.model.Paciente;
import com.clinica.apiclinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> buscarTodos(){
         return repository.findAll();

    }








}
