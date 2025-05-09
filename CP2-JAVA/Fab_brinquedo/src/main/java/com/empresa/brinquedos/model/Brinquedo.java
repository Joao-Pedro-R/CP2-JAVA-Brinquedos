package com.empresa.brinquedos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Brinquedo {

    @Id
    private Long id;
    private String nome;
    private String tipo;
    private String classificacao;
    private String tamanho;
    private Double preco;

    // Getters e Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getClassificacao() { return classificacao; }

    public void setClassificacao(String classificacao) { this.classificacao = classificacao; }

    public String getTamanho() { return tamanho; }

    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public Double getPreco() { return preco; }

    public void setPreco(Double preco) { this.preco = preco; }

}
