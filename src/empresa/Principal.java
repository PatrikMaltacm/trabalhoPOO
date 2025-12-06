package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Boolean rodando = true;
		Scanner teclado = new Scanner(System.in);
		String input;
		
		while(rodando) {
			System.out.println("Bem Vindo ao confrinho!");
			System.out.println("O que deseja fazer hoje? Digite o numero correspondente!");
			System.out.println("1 - Adicionar moedas ao cofrinho");
			System.out.println("2 - Remover moeda do cofrinho");
			System.out.println("3 - Listar todas moedas que estão no cofrinho");
			System.out.println("4 -  Calcular quanto dinheiro existe no cofrinho convertido para Real");
			
			input = teclado.next();
			
			if(input.equalsIgnoreCase("s")) {
				break;
			}
		}
	}

}
