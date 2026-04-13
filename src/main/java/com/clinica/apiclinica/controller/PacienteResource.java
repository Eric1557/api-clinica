package com.clinica.apiclinica.controller;

import com.clinica.apiclinica.model.Paciente;
import com.clinica.apiclinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {

    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity <List<Paciente>> buscarTodosPaciente(){
       List<Paciente> obj = service.buscarTodos();
       return ResponseEntity.ok().body(obj);
    }

}
