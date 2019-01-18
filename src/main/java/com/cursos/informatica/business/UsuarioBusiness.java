package com.cursos.informatica.business;

import com.cursos.informatica.model.Usuario;

import java.util.List;

public interface UsuarioBusiness {
   List<Usuario> findByNicknameWhithPassword(String nickname, String password);
   Usuario create(Usuario usuario);
}
