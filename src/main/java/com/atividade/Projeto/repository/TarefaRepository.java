package com.atividade.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.Projeto.model.Tarefa;



public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	
}

