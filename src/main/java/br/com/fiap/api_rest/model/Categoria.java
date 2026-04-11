package br.com.fiap.api_rest.model;

import jakarta.persistence.Column;

public enum Categoria {
    eletronicos ("Eletrônicos", "Dispositivos eletrônicos em geral", 1),
    vestuario ("Vestuário", "Roupas, calçados e acessórios de moda", 2),
    esporte ("Esportes", "Artigos esportivos e fitness", 3),
    moveis ("Móveis", "Móveis e decoração", 4);

    @Column(name = "id_cat")
    private final Integer id;
    @Column(name = "nm_cat")
    private final String nome;
    @Column(name = "desc_cat")
    private final String descricao;

    Categoria(String nome, String descricao, Integer id) {
        this.nome = nome;
        this.descricao = descricao;
        this. id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public Integer getId(){
        return id;
    }
}
