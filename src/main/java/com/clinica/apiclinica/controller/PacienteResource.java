package com.clinica.apiclinica.controller;

import com.clinica.apiclinica.model.Paciente;
import com.clinica.apiclinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {

    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity <List<Paciente>> buscarPaciente(){
       List<Paciente> obj = service.buscarPaciente();
       return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity <Paciente> inserirPaciente(@RequestBody Paciente obj){
        obj = service.salvar(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
