package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SerieDAO extends JpaRepository<Serie, Integer> {

    @Query(value="select * from serie where genero like %:genero%",nativeQuery = true)
    List<Serie> findByGenero(String genero);

}
