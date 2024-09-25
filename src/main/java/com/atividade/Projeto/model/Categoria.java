package com.atividade.Projeto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Categoria {
    private String nome;
    private String descricao;
    public enum Status {
        CONCLUIDO, ABERTA, ATRASADO;
    }
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    
    
    public Categoria() {
		
	}

	public Categoria(String nome, String descricao, int id) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void adiciona() {
       
    }

    public void remover() {
        
    }

	public void setId(String id) {
		
		
	}
    
}
