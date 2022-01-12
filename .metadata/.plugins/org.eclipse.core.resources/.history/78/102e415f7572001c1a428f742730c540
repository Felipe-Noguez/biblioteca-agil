package com.noguez.exercicioaceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro{
	
	private Status status;
	private List<Livro> listaLivro = new ArrayList<>();
	
	public GerenciadorLivro() {
		preCadastrarLivros();
	}
	
	private void preCadastrarLivros() {
		listaLivro.add(new Livro(1, "Como fazer sentido e bater o martelo", "Alexandro Aolchique", 2017, Status.DISPONIVEL));
		listaLivro.add(new Livro(2, "Sejamos todos feministas", "Chimamanda Ngozi Adichie", 2015, Status.DISPONIVEL));
		listaLivro.add(new Livro(3, "Basquete 101", "Alexandro Aolchique", 2010, Status.DISPONIVEL));
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	//public void verificar() {}
	
	public Status disponibilidade() {
		if(status == Status.DISPONIVEL) {
			return status.DISPONIVEL;
		}else {
			return status.INDISPONIVEL;
		}
	}
	
	public void retirar() {
		status = status.INDISPONIVEL;
	}
		
	public void devolver() {
		status = status.DISPONIVEL;
	}
		
	public void doar() {
		
	}
	
	public void listarLivros() {
		for (Livro livro : listaLivro) {
			System.out.println(livro.getTitulo());
		}
	}

}
