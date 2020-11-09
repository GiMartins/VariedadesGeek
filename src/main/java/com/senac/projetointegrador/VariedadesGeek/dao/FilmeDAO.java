package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeDAO extends JpaRepository<Filme, Integer> {

}
