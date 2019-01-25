package com.cursos.informatica.business.impl;

import com.cursos.informatica.business.AlunoBusiness;
import com.cursos.informatica.model.Aluno;
import com.cursos.informatica.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AlunoBusinessImpl implements AlunoBusiness {
    private final AlunoRepository alunoRepository;

    public AlunoBusinessImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno create(Aluno aluno){
        Aluno aluno1 = alunoRepository.save(aluno);
        return aluno1;
    }
}
