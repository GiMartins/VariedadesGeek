package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.FilmeDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FilmeController {

    @Autowired
    private FilmeDAO filmeDAO;

    @GetMapping("/cadastrar_filme")
    public ModelAndView cadastrarFilme(Filme filme) {
        ModelAndView mv = new ModelAndView("cadastro_filme");

        mv.addObject("filme", filme);
        return mv;
    }

    @PostMapping("/salvarFilme")
    public String salvarFilme(@ModelAttribute Filme filme) {
        filmeDAO.save(filme);

        return "index";
    }

    @GetMapping("/listar_filme")
    public ModelAndView listarfilme() {
        ModelAndView mv = new ModelAndView("listar_filme");
        List<Filme> Filmes = filmeDAO.findAll();

        mv.addObject("filmes", Filmes);

        return mv;
    }

    @GetMapping("/buscarFilme")
    public ModelAndView buscarFilme(@RequestParam(value = "titulo") String titulo) {
        ModelAndView mv = new ModelAndView("listar_filme");
        List<Filme> filmes = filmeDAO.findByTitulo(titulo);

        mv.addObject("filmes", filmes);

        return mv;
    }
}
