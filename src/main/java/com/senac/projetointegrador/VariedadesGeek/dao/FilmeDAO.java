package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import com.senac.projetointegrador.VariedadesGeek.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmeDAO extends JpaRepository<Filme, Integer> {

    @Query(value="select * from filme where nome like %:titulo%",nativeQuery = true)
    List<Filme> findByTitulo(String titulo);

}
