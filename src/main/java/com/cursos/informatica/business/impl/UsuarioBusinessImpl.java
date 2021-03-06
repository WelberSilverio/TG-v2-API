package com.cursos.informatica.business.impl;

import com.cursos.informatica.business.UsuarioBusiness;
import com.cursos.informatica.model.Usuario;
import com.cursos.informatica.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UsuarioBusinessImpl implements UsuarioBusiness {
    private final UsuarioRepository usuarioRepository;

    public UsuarioBusinessImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findByNicknameWithPassword(String nickname, String password){
        return usuarioRepository.findByNicknameAndPassword(nickname, password);
    }

    public Usuario create(Usuario usuario){
       Usuario usuario1 = usuarioRepository.save(usuario);
       return usuario1;
    }

    public void delete(Integer id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }
}
