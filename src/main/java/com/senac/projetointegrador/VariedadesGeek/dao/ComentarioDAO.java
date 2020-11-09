package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioDAO extends JpaRepository<Comentario, Integer> {

}
