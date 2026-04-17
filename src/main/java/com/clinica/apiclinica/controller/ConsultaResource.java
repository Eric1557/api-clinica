package com.clinica.apiclinica.controller;

import com.clinica.apiclinica.model.Consulta;
import com.clinica.apiclinica.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/consultas")
public class ConsultaResource {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<List<Consulta>> buscarConsulta(){
        List<Consulta> obj = consultaService.buscarConsulta();
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Consulta> SalvarConsulta(@RequestBody Consulta consulta){
        Consulta obj = consultaService.SalvarConsulta(consulta);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);

    }

}
