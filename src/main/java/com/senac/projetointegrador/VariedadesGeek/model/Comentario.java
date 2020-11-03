package com.senac.projetointegrador.VariedadesGeek.model;

import java.util.Date;

public class Comentario {
    private Usuario usuario;
    private Date data;
    private Integer quantidadeLike;
    private Integer quantidadeDeslike;
    private Boolean habilitado;

    public Comentario(Usuario usuario, Date data, Integer quantidadeLike, Integer quantidadeDeslike, Boolean habilitado) {
        this.usuario = usuario;
        this.data = data;
        this.quantidadeLike = quantidadeLike;
        this.quantidadeDeslike = quantidadeDeslike;
        this.habilitado = habilitado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getQuantidadeLike() {
        return quantidadeLike;
    }

    public void setQuantidadeLike(Integer quantidadeLike) {
        this.quantidadeLike = quantidadeLike;
    }

    public Integer getQuantidadeDeslike() {
        return quantidadeDeslike;
    }

    public void setQuantidadeDeslike(Integer quantidadeDeslike) {
        this.quantidadeDeslike = quantidadeDeslike;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
}
