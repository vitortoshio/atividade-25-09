 package com.atividade.Projeto.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario {
	    private String nome;
	    private String email;
	    private String senha;
	    
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    
	    
	    
	    
	    
	    
	 
	    public Usuario() {
			
		}

		public Usuario(String nome, String email, String senha, int id) {
			super();
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void CRUD() {
	    
	    }

	    public void logar() {
	  
	    }

		public void setId(String id) {
			
			
		}
	}
