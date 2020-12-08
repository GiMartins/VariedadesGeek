package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Musica;
import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MusicaDAO extends JpaRepository<Musica, Integer> {

    @Query(value="select * from musica where nome_musica like %:nome%",nativeQuery = true)
    List<Musica> findByNome(String nome);

}
