package com.clinica.apiclinica.model;
import java.io.Serializable;
import java.util.Objects;


public class Paciente implements Serializable {

    private long id;

    private String nome;
    private String email;
    private String telephone;

    public Paciente(){
    }

    public Paciente(long id, String nome, String email, String telephone) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telephone = telephone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id == paciente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
