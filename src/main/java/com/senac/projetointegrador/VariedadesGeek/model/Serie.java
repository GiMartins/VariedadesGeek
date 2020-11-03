package com.senac.projetointegrador.VariedadesGeek.model;

public class Serie {
    private String genero;
    private Integer faixaEtaria;
    private String caracterisca;
    private String sinopse;

    public Serie(String genero, Integer faixaEtaria, String caracterisca, String sinopse) {
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.caracterisca = caracterisca;
        this.sinopse = sinopse;
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

    public String getCaracterisca() {
        return caracterisca;
    }

    public void setCaracterisca(String caracterisca) {
        this.caracterisca = caracterisca;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
