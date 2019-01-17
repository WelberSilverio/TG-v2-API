package com.cursos.informatica.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table
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
    private String hrInicio;

    @NotNull
    @Column(name = "hr_fim")
    private String hrFim;
}
