package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;

import java.util.UUID;

public class Estoque {
    @Column(name = "id_esto")
    private UUID id;
    @Min(1)
    @Column(name = "qtd_esto")
    private Integer quantidade;

    public Estoque(UUID id, Integer quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
