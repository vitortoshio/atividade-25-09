package com.atividade.Projeto.model;

import java.util.Date;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date dataCriacao;
    private Date prazo;
    private Status status;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
   

    public Tarefa() {
	
	}

	public Tarefa(String titulo, String descricao, Date dataCriacao, Date prazo, Status status, int id) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.prazo = prazo;
		this.status = status;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getPrazo() {
		return prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void criarTarefa() {
       
    }

    public void executarTarefa() {
       
    }

    public void excluirTarefa() {
        
    }

    public void atualizarTarefa() {
        
    }
}

