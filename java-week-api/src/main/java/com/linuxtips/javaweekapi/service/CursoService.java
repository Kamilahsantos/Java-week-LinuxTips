package com.linuxtips.javaweekapi.service;

import com.linuxtips.javaweekapi.model.Curso;
import com.linuxtips.javaweekapi.repository.CursoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    private CursoRepository cursoRepository;

    public Curso criarCurso (Curso curso){
        return cursoRepository.save(curso);
    }
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public ResponseEntity<Curso> buscarCursoPeloId(Long id) {
        return cursoRepository.findById(id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Curso> atualizarCursoPeloId(Curso curso, Long id) {
        return cursoRepository.findById(id)
                .map(produtoToUpdate -> {
                    produtoToUpdate.setNome(curso.getNome());
                    produtoToUpdate.setPreco(curso.getPreco());
                    produtoToUpdate.setPessoaInstrutora(curso.getPessoaInstrutora());
                    Curso updated = cursoRepository.save(produtoToUpdate);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> apagarCursoId(Long id) {
        return cursoRepository.findById(id)
                .map(produtoToDelete -> {
                    cursoRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElse(ResponseEntity.notFound().build());

    }

}
