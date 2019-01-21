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

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "id")
@Builder
public class Usuario implements Serializable {

    private static final long serialVersionUID = -2389371766862828535L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @NotNull
    @Column(name = "nome_usuario", unique = true)
    private String nickname;

    @NotNull
    @Column(name = "senha")
    private String password;

    @NotNull
    @Column(name = "cargo")
    private String cargo;
}
