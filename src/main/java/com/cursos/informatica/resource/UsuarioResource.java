package com.cursos.informatica.resource;

import com.cursos.informatica.business.UsuarioBusiness;
import com.cursos.informatica.model.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/user")
@Api(value = "API Cursinho Informatica")
@CrossOrigin(origins = "*")
public class UsuarioResource {
    private final UsuarioBusiness usuarioBusiness;

    @Autowired
    public UsuarioResource(UsuarioBusiness usuarioBusiness) {
        this.usuarioBusiness = usuarioBusiness;
    }

    @GetMapping(value= "/all")
    @ApiOperation(value = "Lista todos Usuarios")
    public List<Usuario>listaTodosUsuarios(){
        return usuarioBusiness.findAllUsuarios();
    }

    @GetMapping(value= "/")
    @ApiOperation(value = "Retorna Usuário de Login")
    public List<Usuario> listUsuarioLogin(@RequestBody Usuario usuario){
        return usuarioBusiness.findByNicknameWithPassword(usuario.getNickname(),usuario.getPassword());
    }

    @PostMapping(value="/")
    @ApiOperation(value = "Salva o Usuário")
    public Usuario salvaUsuario(@RequestBody Usuario usuario){
        return usuarioBusiness.create(usuario);
    }

    @DeleteMapping(value="/{id}")
    @ApiOperation(value = "Exclui o Usuário")
    public void deletaUsuario(@PathVariable(value="id") Integer id){
        usuarioBusiness.delete(id);
    }

    @PutMapping(value="/")
    @ApiOperation(value = "Altera o Usuário")
    public Usuario alteraUsuario(@RequestBody Usuario usuario){
        return usuarioBusiness.create(usuario);
    }

}
