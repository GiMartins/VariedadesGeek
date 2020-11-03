package com.senac.projetointegrador.VariedadesGeek.model;

public class Musica {
    private String genero;
    private String artista;
    private Integer faixaEtaria;

    public Musica(String genero, String artista, Integer faixaEtaria) {
        this.genero = genero;
        this.artista = artista;
        this.faixaEtaria = faixaEtaria;
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
}
