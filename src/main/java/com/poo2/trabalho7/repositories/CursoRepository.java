package com.poo2.trabalho7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo2.trabalho7.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer >{

}
