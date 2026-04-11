package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;
import java.util.UUID;

public class Cliente {
    @Column(name = "id")
    private UUID id;
    @Column(name = "nome_cli")
    private String nome;
    @Email
    @Column(name = "email_cli")
    private String email;
    @Column(name = "cpf_cli")
    private String cpf;
    @Column(name = "dt_nasc_cli")
    private LocalDate dtNasc;
    @Column(name = "tel_cli")
    private String telefone;

    public Cliente(UUID id, String name, String email, String cpf, LocalDate dt_nasc, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.telefone = telefone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDt_nasc() {
        return dtNasc;
    }

    public void setDt_nasc(LocalDate dt_nasc) {
        this.dtNasc = dt_nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
