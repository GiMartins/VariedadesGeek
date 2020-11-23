package com.senac.projetointegrador.VariedadesGeek.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nomeCompleto;

    @Column
    private String email;

    @Column
    private String senha;

    @Column
    private String nomeUsuario;

    @Column
    private Integer idade;

    @Column
    private String sexo;


    public Usuario() {
    }

    public Usuario(String nomeCompleto, String email, String senha, String nomeUsuario, Integer idade, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.sexo = sexo;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

