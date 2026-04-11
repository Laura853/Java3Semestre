package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Pedido {

    @Column(name = "id_ped")
    private UUID id;
    @Column(name = "stt_ped")
    private String status;//pago
    @Column(name = "dt_ped")
    private LocalDateTime data;
    @Column(name = "prod_ped")
    private List<Produto> produto;
    //list produto;
    @Column(name = "val_ped")
    private BigDecimal valor;


    public Pedido(UUID id, String status, LocalDateTime data, BigDecimal valor) {
        this.id = id;
        this.status = status;
        this.data = data;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
