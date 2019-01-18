package com.cursos.informatica.repository;

import com.cursos.informatica.model.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificado,Integer> {
}
