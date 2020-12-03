package com.senac.projetointegrador.VariedadesGeek.dao;

import com.senac.projetointegrador.VariedadesGeek.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

    @Query(value="select * from usuario where nome_completo like %:nome%",nativeQuery = true)
    List<Usuario> findByNome(String nome);

}
