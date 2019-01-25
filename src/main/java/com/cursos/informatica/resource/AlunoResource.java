package com.cursos.informatica.resource;

import com.cursos.informatica.business.AlunoBusiness;
import com.cursos.informatica.model.Aluno;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/student")
@Api(value = "API Cursinho Informatica")
@CrossOrigin(origins = "*")
public class AlunoResource {
    private final AlunoBusiness alunoBusiness;

    @Autowired
    public AlunoResource(AlunoBusiness alunoBusiness) {
        this.alunoBusiness = alunoBusiness;
    }

    @PostMapping(value="/")
    @ApiOperation(value = "Salva o Aluno")
    public Aluno salvaAluno(@RequestBody Aluno usuario){
        return alunoBusiness.create(usuario);
    }

    @GetMapping(value= "/all")
    @ApiOperation(value = "Lista todos Alunos")
    public List<Aluno> listaTodosAlunos(){ return alunoBusiness.findAll(); }
}
