package com.linuxtips.javaweekapi.repository;

import com.linuxtips.javaweekapi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
