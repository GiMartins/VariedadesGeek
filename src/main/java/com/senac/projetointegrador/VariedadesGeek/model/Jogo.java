package com.senac.projetointegrador.VariedadesGeek.model;

public class Jogo {
    private String genero;
    private Integer faixaEtaria;
    private String sinopse;
    private String modos;
    private String caracteristicas;
    private String plataforma;

    public Jogo(String genero, Integer faixaEtaria, String sinopse, String modos, String caracteristicas, String plataforma) {
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.sinopse = sinopse;
        this.modos = modos;
        this.caracteristicas = caracteristicas;
        this.plataforma = plataforma;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setModos(String modos) {
        this.modos = modos;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
