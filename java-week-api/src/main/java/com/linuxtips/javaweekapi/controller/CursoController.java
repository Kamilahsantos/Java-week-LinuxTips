package com.linuxtips.javaweekapi.controller;


import com.linuxtips.javaweekapi.model.Curso;
import com.linuxtips.javaweekapi.service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CursoController {

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    CursoService cursoService;

    @PostMapping("/cursos")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoService.criarCurso(curso);
    }

    @GetMapping("/cursos")
    @ResponseStatus(HttpStatus.OK)
    public List<Curso> listarCurso() {
        return cursoService.listarCursos();
    }

    @GetMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> buscarProdutoPeloId(@PathVariable(value = "id") Long id) {
        return cursoService.buscarCursoPeloId(id);
    }

    @PutMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> atualizarProdutoPeloId(@PathVariable(value = "id") Long id, @RequestBody Curso curso) {
        return cursoService.atualizarCursoPeloId(curso, id);
    }

    @DeleteMapping("/cursos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> apagarCursoPeloId(@PathVariable(value = "id") Long id) {
        return cursoService.apagarCursoId(id);
    }
}
