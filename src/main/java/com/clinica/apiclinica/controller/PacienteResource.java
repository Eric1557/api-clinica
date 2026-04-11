package com.clinica.apiclinica.controller;

import com.clinica.apiclinica.model.Paciente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {

    @GetMapping
    public ResponseEntity<Paciente> buscarPaciente(){
        Paciente p = new Paciente(1,"Eric","eric@gmail.com","999999999");
        return ResponseEntity.ok().body(p);
    }

}
