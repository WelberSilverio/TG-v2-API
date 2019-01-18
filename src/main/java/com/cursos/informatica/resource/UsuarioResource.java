package com.cursos.informatica.resource;

import com.cursos.informatica.business.UsuarioBusiness;
import com.cursos.informatica.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/user")
public class UsuarioResource {
    private final UsuarioBusiness usuarioBusiness;

    @Autowired
    public UsuarioResource(UsuarioBusiness usuarioBusiness) {
        this.usuarioBusiness = usuarioBusiness;
    }

    @GetMapping(value= "/{nickname,password}")
    public List<Usuario> listUsuarioLogin(@PathVariable(value="nickname") String nickname, @PathVariable(value="password") String password){
        return usuarioBusiness.findByNicknameWhithPassword(nickname,password);
    }

    @PostMapping(value="/")
    public Usuario salvaUsuario(@RequestBody Usuario usuario){
        return usuarioBusiness.create(usuario);
    }


}
