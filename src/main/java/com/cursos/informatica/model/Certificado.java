package com.cursos.informatica.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "certificados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Builder
public class Certificado implements Serializable {

    private static final long serialVersionUID = 2398038106743387147L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_certificado")
    private Integer id;

    @Column(name = "data_emissao")
    private LocalDateTime dataEmissao;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prof_um")
    private Usuario idProfUm;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prof_dois")
    private Usuario idProfDois;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;
}
