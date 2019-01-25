package com.cursos.informatica.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "horarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Builder
public class Horario implements Serializable {

    private static final long serialVersionUID = -6121106002120944837L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Integer id;

    @Column(name = "dia")
    private String dia;

    @NotNull
    @Column(name = "hr_inicio")
    private LocalTime hrInicio;

    @NotNull
    @Column(name = "hr_fim")
    private LocalTime hrFim;
}
