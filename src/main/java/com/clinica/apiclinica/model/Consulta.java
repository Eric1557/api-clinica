package com.clinica.apiclinica.model;

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
    private Instant data_consulta;
    private String descricao;

    public Consulta(){
    }

    public Consulta(Long id, Instant data_consulta, String descricao) {
        this.id = id;
        this.data_consulta = data_consulta;
        this.descricao = descricao;
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


