package com.senac.projetointegrador.VariedadesGeek.controller;

import com.senac.projetointegrador.VariedadesGeek.dao.JogoDAO;
import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import com.senac.projetointegrador.VariedadesGeek.model.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JogoController {

    @Autowired
    private JogoDAO jogoDAO;

    @GetMapping("/cadastrar_jogo")
    public ModelAndView cadastrarJogo(Jogo jogo) {
        ModelAndView mv = new ModelAndView("cadastro_jogo");

        mv.addObject("jogo", jogo);
        return mv;
    }

    @PostMapping("/salvarJogo")
    public String salvarJogo(@ModelAttribute Jogo jogo) {
        jogoDAO.save(jogo);

        return "index";
    }

    @GetMapping("/listar_jogo")
    public ModelAndView listarjogo() {
        ModelAndView mv = new ModelAndView("listar_jogo");
        List<Jogo> Jogos = jogoDAO.findAll();

        mv.addObject("jogos", Jogos);

        return mv;
    }

    @GetMapping("/buscarJogo")
    public ModelAndView buscarJogo(@RequestParam(value = "genero") String genero) {
        ModelAndView mv = new ModelAndView("listar_jogo");
        List<Jogo> jogos = jogoDAO.findByGenero(genero);

        mv.addObject("jogos", jogos);

        return mv;

    }
}
