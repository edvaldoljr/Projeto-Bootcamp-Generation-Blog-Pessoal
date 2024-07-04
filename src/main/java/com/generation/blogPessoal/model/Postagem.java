package com.generation.blogPessoal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O titulo é obrigatorio!")
    @Size(min = 10, max = 1000, message = "O texto deve conter entre 10 e 1000 caracteres!")
    private String titulo;

    @UpdateTimestamp
    private LocalDateTime data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O titulo é obrigatorio!") @Size(min = 10, max = 1000, message = "O texto deve conter entre 10 e 1000 caracteres!") String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NotBlank(message = "O titulo é obrigatorio!") @Size(min = 10, max = 1000, message = "O texto deve conter entre 10 e 1000 caracteres!") String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
