package com.cursos.informatica.repository;

import com.cursos.informatica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    public List<Usuario> findByNicknameWhithPassword(String nickname, String password);
}
