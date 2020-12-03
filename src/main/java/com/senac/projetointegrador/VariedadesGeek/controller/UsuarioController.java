package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.UsuarioDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("/cadastrar_usuario")
    public ModelAndView cadastrarUsuario(Usuario usuario){
        ModelAndView mv = new ModelAndView("cadastro_usuario");

        mv.addObject("usuario", usuario);
        return mv;
    }

    @PostMapping("/salvarUsuario")
    public String salvarUsuario(@ModelAttribute Usuario usu){
        usuarioDAO.save(usu);

        return "index";
    }

    @GetMapping("/listar_usuarios")
    public ModelAndView listarUsuario(){
        ModelAndView mv = new ModelAndView("listar_usuario");
        List<Usuario> usuarios = usuarioDAO.findAll();

        mv.addObject("usuarios",usuarios);

        return mv;

    }

    @GetMapping("/buscarUsuario")
    public ModelAndView buscarUsuario(@RequestParam(value = "nome") String nome){
        ModelAndView mv = new ModelAndView("listar_usuario");
        List<Usuario> usuarios = usuarioDAO.findByNome(nome);

        mv.addObject("usuarios",usuarios);

        return mv;
    }


}
