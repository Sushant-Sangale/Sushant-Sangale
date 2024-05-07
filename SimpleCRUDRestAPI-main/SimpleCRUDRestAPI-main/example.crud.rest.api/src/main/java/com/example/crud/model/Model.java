package com.example.crud.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Model implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	int id;
	String nome;
	
}
