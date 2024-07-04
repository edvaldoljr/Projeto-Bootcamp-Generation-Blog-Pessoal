package com.generation.blogPessoal.controller;

import com.generation.blogPessoal.model.Postagem;
import com.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
@RequestMapping("/postagem")
public class PostagemControler {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping
   public ResponseEntity<List<Postagem>> getAll() {
       return ResponseEntity.ok(postagemRepository.findAll());
   }
}
