package com.noguez.exercicioaceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class GerenciadorLivro{
	
	Scanner input = new Scanner(System.in);
	private Status status;
	private List<Livro> listaLivro = new ArrayList<>();
	
	public GerenciadorLivro() {
		preCadastrarLivros();
	}
	
	private void preCadastrarLivros() {
		listaLivro.add(new Livro(0, "Como fazer sentido e bater o martelo", "Alexandro Aolchique", 2017, Status.DISPONIVEL));
		listaLivro.add(new Livro(1, "Sejamos todos feministas", "Chimamanda Ngozi Adichie", 2015, Status.DISPONIVEL));
		listaLivro.add(new Livro(2, "Basquete 101", "Alexandro Aolchique", 2010, Status.DISPONIVEL));
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}	
	
	public Status disponibilidade() {
		if(status == Status.DISPONIVEL) {
			return status.DISPONIVEL;
		}else {
			return status.INDISPONIVEL;
		}
	}
	
	public void retirar() {
		try {
			int codigo;
			System.out.print("Entre com o c?digo do livro a ser retirado: ");
			codigo = input.nextInt();
			input.nextLine();

			for (Livro livro : listaLivro) {
				if (livro.getId() == codigo && livro.getStatus() == status.DISPONIVEL) {
					livro.setStatus(Status.INDISPONIVEL);
				} else {
					System.out.println("Livro indispon?vel.");
				}
			} 
		} catch (Exception e) {
			System.out.println("Algum valor inv?lido, verifique e tente novamente!");
		}
		//tentei implmentar com Lambda, mas n?o obtive sucesso T_T
		//listaLivro.stream().filter(c -> c.getId() == codigo).map(l -> l.getStatus().compareTo(status.DISPONIVEL));
		
	}
		
	public void devolver() {
		try {
			int codigo;
			System.out.print("Entre com o c?digo do livro a ser devolvido: ");
			codigo = input.nextInt();
			input.nextLine();

			for (Livro livro : listaLivro) {
				if (livro.getId() == codigo && livro.getStatus() == status.INDISPONIVEL) {
					livro.setStatus(Status.DISPONIVEL);
				} else {
					System.out.println("Livro dispon?vel.");
				}
			} 
		} catch (Exception e) {
			System.out.println("Algum valor inv?lido, verifique e tente novamente!");
		}
	}	
		
	public void doar() {
		try {
			int novoId = listaLivro.size();
			System.out.print("Entre com o t?tulo do livro a ser doado: ");
			String titulo = input.nextLine();
			System.out.print("Entre com o autor do livro a ser doado: ");
			String autor = input.nextLine();
			System.out.print("Entre com o ano de publica??o do livro a ser doado: ");
			int ano = input.nextInt();
			input.nextLine();

			listaLivro.add(new Livro(novoId, titulo, autor, ano, Status.DISPONIVEL));
			System.out.println("Obrigado por sua doa??o! :D");
		} catch (Exception e) {
			System.out.println("Algum valor inv?lido, verifique e tente novamente!");
		}
	}	
	
	public void listarLivros() {
		for (Livro livro : listaLivro) {
			System.out.println("C?digo: " + livro.getId() + ", T?tulo: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Status: " + livro.getStatus());
		}
	}

}
