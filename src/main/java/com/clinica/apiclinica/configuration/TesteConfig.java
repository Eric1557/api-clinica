package com.clinica.apiclinica.configuration;

import com.clinica.apiclinica.model.Paciente;
import com.clinica.apiclinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public void run(String... args) throws Exception {


        Paciente p1 = new Paciente(null,"Eric","eric@gmail.com","99999999");
        Paciente p2 = new Paciente(null,"Davi","davi@gmail.com","99999999");

        pacienteRepository.saveAll(Arrays.asList(p1,p2));



    }
}
