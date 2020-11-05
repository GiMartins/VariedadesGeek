package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

}
