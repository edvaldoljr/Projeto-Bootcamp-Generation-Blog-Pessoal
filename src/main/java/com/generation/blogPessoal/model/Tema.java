package com.generation.blogPessoal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_temas")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O campo Descrição é obrigatorio")
    private String descriao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "O campo Descrição é obrigatorio") String getDescriao() {
        return descriao;
    }

    public void setDescriao(@NotNull(message = "O campo Descrição é obrigatorio") String descriao) {
        this.descriao = descriao;
    }
}
