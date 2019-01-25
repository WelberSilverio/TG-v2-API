package com.cursos.informatica.business;

import com.cursos.informatica.model.Aluno;

import java.util.List;

public interface AlunoBusiness {
    Aluno create(Aluno aluno);
    List<Aluno> findAll();
}
