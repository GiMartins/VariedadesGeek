package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Jogo;
import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogoDAO extends JpaRepository<Jogo, Integer> {

    @Query(value="select * from jogo where genero like %:genero%",nativeQuery = true)
    List<Jogo> findByGenero(String genero);

}
