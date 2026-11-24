package projetofinalpoo20262;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int option;
		boolean sair = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[1] Cadastrar Ingresso Meia-Entrada\n"
				+ "[2] Cadastrar Ingresso VIP\n"
				+ "[3] Listar Todos os Ingressos Emitidos\n"
				+ "[4] Buscar Ingresso por Código\n"
				+ "[5] Calcular Arrecadação Total da Bilheteria\n"
				+ "[9] Carregar Dados de Teste\n"
				+ "[0] Sair");
		
		System.out.print("\nDigite uma opção: ");
		option = scanner.nextInt();
		
		if(sair == false) {
			switch(option) {
			case 1:
				//Cadastrar Ingresso Meia-Entrada\
				break;
			case 2:
				//Cadastrar Ingresso VIP
				break;
			case 3:
				//Listar Todos os Ingressos Emitidos
				break;
			case 4:
				//Buscar Ingresso por Código
				break;
			case 5:
				//Calcular Arrecadação Total da Bilheteria
				break;
			case 9:
				//Carregar Dados de Teste
				break;
			case 0:
				sair = true;
				break;
			default:
				System.out.print("Digite outra opção: ");
				option = scanner.nextInt();
			}
		}
		
	}

}
