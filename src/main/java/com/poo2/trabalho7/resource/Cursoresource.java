package com.poo2.trabalho7.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.poo2.trabalho7.entities.Curso;
import com.poo2.trabalho7.services.Cursoservice;

@RestController
@RequestMapping(value="/cursos")
public class Cursoresource {
	@Autowired
	private Cursoservice service;
	@GetMapping
	public  ResponseEntity<List<Curso>> findAll(){
	List<Curso> lista =service.findAll();
	return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value="/{id}")
public ResponseEntity<Curso> findById(@PathVariable Integer id)
	{Curso curso = service.findById(id); return ResponseEntity.ok().body(curso); }
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Curso> insert(@RequestBody Curso curso){
		 curso = service.insert(curso);
		 return ResponseEntity.ok().body(curso);
	}
		@DeleteMapping(value ="/id")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete (@PathVariable Integer id) {service.delete(id);}
		@PutMapping(value="/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void update(@PathVariable Integer id, @RequestBody Curso curso) {
			service.update(id, curso);
			
		}
}
