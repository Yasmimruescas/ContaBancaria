package Conta;

import java.util.Scanner;
import Conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND	+ "********************************************************");
			System.out.println(" 	 						");
			System.out.println("                    BANCO DO BRAZIL!                    ");
			System.out.println("							");
			System.out.println("********************************************************");
			System.out.println("               1- Criar uma conta                       ");
			System.out.println("               2- Listar todas as contas!               ");
			System.out.println("               3- Buscar conta por número!              ");
			System.out.println("               4- Atualizar dados da conta!             ");
			System.out.println("               5- Apagar conta!                         ");
			System.out.println("               6- Sacar!                                ");
			System.out.println("               7- Depositar!                            ");
			System.out.println("               8- Transferir valores entre contas!      ");
			System.out.println("               9- Sair!\"                                ");
			System.out.println("********************************************************");
			System.out.println("     	       Digite a opção que deseja:               ");
			System.out.println(" 							" + Cores.TEXT_RESET);

			opcao = scanner.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil- O seu futuro começa aqui!!");
				sobre();
				scanner.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar conta\n\n");

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as contas\n\n");

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");

				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da conta\n\n");

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a conta\n\n");

				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE + "Deposito\n\n");

				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferencia entre contas\n\n");

				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);

				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}
}
