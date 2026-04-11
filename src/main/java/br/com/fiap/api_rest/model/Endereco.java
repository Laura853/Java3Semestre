package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;

import java.util.UUID;

public class Endereco {

    @Column(name = "id_end")
    private UUID id;
    @Column(name = "logr_end")
    private String logradouro;
    @Column(name = "num_end")
    private String numero;
    @Column(name = "comp_end")
    private String complemento;
    @Column(name = "cid_end")
    private String cidade;
    @Column(name = "bairro_end")
    private String bairro;
    @Column(name = "est_end")
    private String estado;
    @Column(name = "cep_end")
    private String cep;


    public Endereco(UUID id, String logradouro, String numero, String complemento, String cidade, String bairro, String estado, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
