package com.clinica.apiclinica.repository;

import com.clinica.apiclinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}