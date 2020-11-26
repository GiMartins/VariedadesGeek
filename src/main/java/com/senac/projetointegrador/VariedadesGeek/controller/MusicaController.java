package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.MusicaDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import com.senac.projetointegrador.VariedadesGeek.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @GetMapping("/listar_musica")
    public ModelAndView listarmusica(){
        ModelAndView mv = new ModelAndView("listar_musica");
        List<Musica> Musicas = musicaDAO.findAll();

        mv.addObject("musicas",Musicas);

        return mv;
    }
}
