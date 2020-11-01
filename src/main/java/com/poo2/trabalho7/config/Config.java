package com.poo2.trabalho7.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.poo2.trabalho7.entities.Curso;
import com.poo2.trabalho7.repositories.CursoRepository;
import com.poo2.trabalho7.repositories.AlunoRepository;
@Configuration
public class Config implements CommandLineRunner{
	
	@Autowired
	private CursoRepository  cursoRepository ;
	@Autowired
	private AlunoRepository  alunoRepository ;

	@Override
	public void run(String... args) throws Exception {
	
	   /* Curso c1 = new Curso(null , "spring");
		Curso c2 = new Curso(null , "JPA");
		cursoRepository.save(c1);
		cursoRepository.save(c2);*/


	}
}
