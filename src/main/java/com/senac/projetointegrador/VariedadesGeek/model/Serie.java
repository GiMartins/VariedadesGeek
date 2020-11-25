package com.senac.projetointegrador.VariedadesGeek.model;

import javax.persistence.*;

@Entity
@Table(name = "serie")


public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String genero;

    @Column
    private Integer faixaEtaria;

    @Column
    private String caracteristica;

    @Column
    private String sinopse;

    public Serie() {
    }

    public Serie(Integer id, String genero, Integer faixaEtaria, String caracteristica, String sinopse) {
        this.id = id;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.caracteristica = caracteristica;
        this.sinopse = sinopse;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
