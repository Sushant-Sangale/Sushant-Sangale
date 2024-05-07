package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Model;

@Repository
public interface IdRepository extends JpaRepository<Model, Integer>{
}
