package com.cursos.informatica.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "matriculas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Builder
public class Matricula implements Serializable{

    private static final long serialVersionUID = 558175828253564781L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer id;

    @Column(name = "data_matricula")
    private LocalDateTime dataMatricula;

    @Column(name = "status_matricula")
    private String statusMatricula;

    @Column(name = "modulo_atual")
    private String moduloAtual;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_horario_um")
    private Horario idHorarioUm;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_horario_dois")
    private Horario idHorarioDois;
}
