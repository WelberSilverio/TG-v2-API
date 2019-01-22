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

    @GetMapping(value= "/")
    public List<Usuario> listUsuarioLogin(@RequestBody Usuario usuario){
        return usuarioBusiness.findByNicknameWithPassword(usuario.getNickname(),usuario.getPassword());
    }

    @PostMapping(value="/")
    public Usuario salvaUsuario(@RequestBody Usuario usuario){
        return usuarioBusiness.create(usuario);
    }

    @DeleteMapping(value="/{id}")
    public void deletaUsuario(@PathVariable(value="id") Integer id){
        usuarioBusiness.delete(id);
    }

    @PutMapping(value="/")
    public Usuario alteraUsuario(@RequestBody Usuario usuario){
        return usuarioBusiness.create(usuario);
    }

}
