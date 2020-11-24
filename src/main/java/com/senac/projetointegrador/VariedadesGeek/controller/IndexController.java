package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.UsuarioDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("/")
    public String paginaInicial(){
//
//        Usuario usuario = new Usuario("Giovana Martins", "giovana@gmail.com",
//                "123456", "Giovana", 23, "Feminino");
//
//        usuarioDAO.save(usuario);

        return "index";

    }

    @GetMapping("/sobre")
    public String paginaSobre(){
        return "sobre";

    }

}
