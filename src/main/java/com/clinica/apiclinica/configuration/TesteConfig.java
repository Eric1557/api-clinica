package com.clinica.apiclinica.configuration;

import com.clinica.apiclinica.model.Consulta;
import com.clinica.apiclinica.model.Paciente;
import com.clinica.apiclinica.repository.ConsultaRepository;
import com.clinica.apiclinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public void run(String... args) throws Exception {


        Paciente p1 = new Paciente(null,"Eric","eric@gmail.com","99999999","12345");
        Paciente p2 = new Paciente(null,"Davi","davi@gmail.com","88888888","123456");

        Consulta c1 = new Consulta(null, Instant.parse("2026-05-26T14:00:07Z"),"Cirurgião torácico",p1);
        Consulta c2 = new Consulta(null, Instant.parse("2026-06-27T15:00:07Z"),"Pneumologista",p2);


        pacienteRepository.saveAll(Arrays.asList(p1,p2));
        consultaRepository.saveAll(Arrays.asList(c1,c2));



    }
}
