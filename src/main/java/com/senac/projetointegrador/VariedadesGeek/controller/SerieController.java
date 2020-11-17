package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.SerieDAO;

import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SerieController {

    @Autowired
    private SerieDAO serieDAO;

    @GetMapping("/cadastrar_serie")
    public ModelAndView cadastrarSerie(Serie serie){
        ModelAndView mv = new ModelAndView("cadastro_serie");

        mv.addObject("serie", serie);
        return mv;
    }

    @PostMapping("/salvarSerie")
    public String salvarUsuario(@ModelAttribute Serie serie){
       serieDAO.save(serie);

        return "index";
    }
}
