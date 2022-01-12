package com.noguez.exercicioaceleradora.biblioteca;

import java.util.Scanner;

public class Menu {
	
	private int opcao;
	
	public static void menu() { // menu principal
		int opcao = 0;
		Scanner input = new Scanner(System.in);
		GerenciadorLivro gerenciadorLivro = new GerenciadorLivro();
		
		do {
			System.out.println("1 - Retirar.");
			System.out.println("2 - Devolver.");
			System.out.println("3 - Doar.");
			System.out.println("4 - Listar livros.");
			System.out.println("5 - Sair.");

			System.out.println("Escolha uma opção: ");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				gerenciadorLivro.retirar();
				break;
			case 2:
				gerenciadorLivro.devolver();
				break;
			case 3:
				//doar();
				break;
			case 4:
				gerenciadorLivro.listarLivros();
				break;
			case 5:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 4);
	}
	
	

}
