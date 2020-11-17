package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.FilmeDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FilmeController {

    @Autowired
    private FilmeDAO filmeDAO;

    @GetMapping("/cadastrar_filme")
    public ModelAndView cadastrarFilme(Filme filme){
        ModelAndView mv = new ModelAndView("cadastro_filme");

        mv.addObject("filme", filme);
        return mv;
    }

    @PostMapping("/salvarFilme")
    public String salvarFilme(@ModelAttribute Filme filme){
        filmeDAO.save(filme);

        return "index";
    }
}
