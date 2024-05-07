package com.example.crud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Model;
import com.example.crud.service.IdService;

@RestController
@RequestMapping(value="/")
public class Controller {
	
	final IdService service;
	public Controller(IdService service){
		this.service = service;
	}
	
	//FindAll
	@GetMapping(value="/findall")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(service.findAll());	
	}
		
	//create
	@RequestMapping(value = "/add")
	@PostMapping
	public ResponseEntity<Model>adicionar(@RequestBody Model pessoa){
	return ResponseEntity.status(HttpStatus.CREATED).body(service.save(pessoa));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(service.find(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody Model pessoa){
	return ResponseEntity.status(HttpStatus.OK).body(service.update(pessoa));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		service.delete(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
}
