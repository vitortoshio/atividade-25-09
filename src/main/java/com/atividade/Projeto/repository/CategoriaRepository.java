package com.atividade.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.Projeto.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
}