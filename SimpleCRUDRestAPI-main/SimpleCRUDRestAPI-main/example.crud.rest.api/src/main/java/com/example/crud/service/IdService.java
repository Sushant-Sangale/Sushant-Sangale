package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.crud.model.Model;
import com.example.crud.repository.IdRepository;
@Service
public class IdService {
	
	IdRepository repository;
	IdService(IdRepository repository){
		this.repository = repository;
	}
	//FindAll
	public List<Model>findAll(){
		return repository.findAll(); 
	}
	
	//Create
	public Model save(Model pessoa){	
		return repository.save(pessoa);
	}
	//Read
	public Optional<Model> find(int id){
		return repository.findById(id);
	}
	//Update
	public Model update(Model pessoa){
		return repository.save(pessoa);
	}
	
	//Delete
	public void delete(int id){
		repository.deleteById(id);
	}
}
