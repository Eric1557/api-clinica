package com.clinica.apiclinica.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name="tb_consulta")
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant data_consulta;


    private String descricao;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;

    public Consulta(){
    }

    public Consulta(Long id, Instant data_consulta, String descricao,Paciente paciente) {
        this.id = id;
        this.data_consulta = data_consulta;
        this.descricao = descricao;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Instant data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void setPaciente(Paciente paciente){
         this.paciente = paciente;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(id, consulta.id) && Objects.equals(data_consulta, consulta.data_consulta) && Objects.equals(descricao, consulta.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data_consulta, descricao);
    }
}


