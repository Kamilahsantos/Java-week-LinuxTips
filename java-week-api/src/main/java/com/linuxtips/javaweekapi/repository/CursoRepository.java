package com.linuxtips.javaweekapi.repository;

import com.linuxtips.javaweekapi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
