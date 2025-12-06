package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofre = new Cofrinho();
		Scanner teclado = new Scanner(System.in);
		String input;
		String moedaSelecionada;
		double valorAdd;

		while (true) {
			System.out.println("Bem Vindo ao confrinho!");
			System.out.println("O que deseja fazer hoje? Digite o numero correspondente!");
			System.out.println("1 - Adicionar moedas ao cofrinho");
			System.out.println("2 - Remover moeda do cofrinho");
			System.out.println("3 - Listar todas moedas que estão no cofrinho");
			System.out.println("4 -  Calcular quanto dinheiro existe no cofrinho convertido para Real");
			System.out.println("OU Digite (X) para sair");

			input = teclado.next();

			switch (input) {

			// Adicionar Moedas
			case "1":
				while (true) {

					System.out.println("Selecione a Moeda para depositar: Digite a Letra!");
					System.out.println("E - Euro");
					System.out.println("OU X para voltar pro MENU");

					moedaSelecionada = teclado.next();

					if (moedaSelecionada.equalsIgnoreCase("x"))
						break;

					if (moedaSelecionada.equalsIgnoreCase("e")) {

						System.out.println("Qual o valor a ser adicionado? ");

						valorAdd = teclado.nextDouble();
						cofre.adicionar(new Euro(valorAdd));

						System.out.println("Deposito feito com sucesso!");
						System.out.println("1 - Adicionar mais moeda");
						System.out.println("OU X para voltar ao MENU");

						input = teclado.next();

						if (input.equals("1")) {
							continue;
						} else if (input.equalsIgnoreCase("x")) {
							input = "";
							break;
						} else {
							System.out.println("Opção invalida, Voltando ao MENU...");
							input = "";
							break;
						}

					} else {
						System.out.println("Moeda não encontrada, digite novamente!");
					}
				}
				break;

			// Remover Moeda
			case "2":
				while (true) {
					System.out.println("Selecione a Moeda para remover: Digite a Letra!");
					System.out.println("E - Euro");
					System.out.println("OU X para voltar ao MENU");

					moedaSelecionada = teclado.next();

					if (moedaSelecionada.equalsIgnoreCase("x"))
						break;

					if (moedaSelecionada.equalsIgnoreCase("e")) {
						double saldoEuro = cofre.saldoPorMoeda(Euro.class);

						System.out.println("Qual o valor a ser removido? ");

						valorAdd = teclado.nextDouble();
						if (saldoEuro < valorAdd) {
							System.out.println("Saldo insuficiente");
							continue;
						}
						cofre.remover(new Euro(valorAdd));

						System.out.println("Moeda removida com sucesso!");
						System.out.println("1 - Remover mais moeda");
						System.out.println("OU X Sair para o MENU");

						input = teclado.next();

						if (input.equals("1")) {
							continue;
						} else if (input.equalsIgnoreCase("x")) {
							input = "";
							break;
						} else {
							System.out.println("Opção invalida, Voltando ao MENU...");
							input = "";
							break;
						}

					} else {
						System.out.println("Moeda não encontrada, digite novamente!");
					}
				}
				break;

			case "3":
				while (true) {
					System.out.println("Moedas que estão no cofrinho: ");

					cofre.listarMoedas();

					System.out.println("Digite X para voltar ao MENU");

					input = teclado.next();

					if (input.equalsIgnoreCase("x")) {
						input = "";
						break;
					} else {
						System.out.println("Opção invalida, Voltando ao MENU...");
						input = "";
						break;
					}

				}
				break;
			case "4":
				while (true) {
					System.out.println("Seu total de moedas convertido para Real: ");

					System.out.println("R$ " + cofre.totalConvertido());

					System.out.println("Digite X para voltar ao MENU");

					input = teclado.next();

					if (input.equalsIgnoreCase("x")) {
						input = "";
						break;
					} else {
						System.out.println("Opção invalida, Voltando ao MENU...");
						input = "";
						break;
					}

				}
				break;
			}

			// Fechar aplicação
			if (input.equalsIgnoreCase("x")) {
				break;
			}
		}
	}

}
