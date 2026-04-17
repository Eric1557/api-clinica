package com.clinica.apiclinica.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_paciente")
public class Paciente implements Serializable {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nome;
    @Setter
    private String email;
    @Setter
    private String telephone;
    @Setter
    private String cpf;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private List<Consulta> consultas;

    public Paciente() {
    }

    public Paciente(Long id, String nome, String email, String telephone, String cpf) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telephone = telephone;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(id, paciente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}