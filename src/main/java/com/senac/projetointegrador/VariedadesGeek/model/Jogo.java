package com.senac.projetointegrador.VariedadesGeek.model;

import javax.persistence.*;

@Entity
@Table(name = "jogo")

public class Jogo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String genero;

    @Column
    private Integer faixaEtaria;

    @Column
    private String sinopse;

    @Column
    private String modos;

    @Column
    private String caracteristicas;

    @Column
    private String plataforma;

    public Jogo(String genero, Integer faixaEtaria, String sinopse, String modos, String caracteristicas, String plataforma) {
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.sinopse = sinopse;
        this.modos = modos;
        this.caracteristicas = caracteristicas;
        this.plataforma = plataforma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
