package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.MusicaDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicaController {

    @Autowired
    private MusicaDAO musicaDAO;

    @GetMapping("/cadastrar_musica")
    public ModelAndView cadastrarMusica(Musica musica){
        ModelAndView mv = new ModelAndView("cadastro_musica");

        mv.addObject("musica", musica);
        return mv;
    }

    @PostMapping("/salvarMusica")
    public String salvarMusica(@ModelAttribute Musica musica){
        musicaDAO.save(musica);

        return "index";
    }
}
