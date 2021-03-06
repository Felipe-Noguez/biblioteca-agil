package com.noguez.exercicioaceleradora.biblioteca;

public class Livro {
	
	private int id;
	private String titulo;
	private String autor;
	private int ano;
	private Status status;
	
	public Livro(int id, String titulo, String autor, int ano, Status status) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.status = status;
	}
	

	public Livro() {
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
		
}
