package com.poo2.trabalho7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo2.trabalho7.entities.Aluno;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
