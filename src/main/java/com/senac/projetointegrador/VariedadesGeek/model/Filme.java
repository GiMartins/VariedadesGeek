package com.senac.projetointegrador.VariedadesGeek.model;

public class Filme {
    private String nome;
    private String genero;
    private Integer faixaEtaria;
    private String caracteristica;
    private String sinopse;

    public Filme(String nome, String genero, Integer faixaEtaria, String caracteristica, String sinopse) {
        this.nome = nome;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.caracteristica = caracteristica;
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
