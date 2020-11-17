package com.senac.projetointegrador.VariedadesGeek.model;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "musica")

public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nomeMusica;

    @Column
    private String genero;

    @Column
    private String artista;

    @Column
    private Integer faixaEtaria;

    public Musica(Integer id, String nomeMusica, String genero, String artista, Integer faixaEtaria) {
        this.id = id;
        this.nomeMusica = nomeMusica;
        this.genero = genero;
        this.artista = artista;
        this.faixaEtaria = faixaEtaria;
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(Integer faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
}
