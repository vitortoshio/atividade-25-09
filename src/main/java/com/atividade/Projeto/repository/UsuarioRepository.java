package com.atividade.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.Projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

 
}
