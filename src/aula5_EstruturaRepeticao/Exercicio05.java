package aula5_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int opcao, comprasProdutoA = 0, comprasProdutoB = 0, comprasProdutoC = 0;
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("ADICIONAR COMPRA: ");
			System.out.println("[1] - Produto A");
			System.out.println("[2] - Produto B");
			System.out.println("[3] - Produto C");
			System.out.println("[4] - Fim");
			System.out.print("Digite a opcao: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				comprasProdutoA++;
				System.out.println("Produto A comprado!");
				break;
			case 2:
				comprasProdutoB++;
				System.out.println("Produto B comprado!");
				break;
			case 3:
				comprasProdutoC++;
				System.out.println("Produto C comprado!");
				break;
			case 4:
				break;
			default:
				System.out.println("Código Inválido! Tente novamente!");
			}
		}while(opcao != 4);
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Total de clientes que compraram o produto A: "+comprasProdutoA);
		System.out.println("Total de clientes que compraram o produto B: "+comprasProdutoB);
		System.out.println("Total de clientes que compraram o produto C: "+comprasProdutoC);
	}

}
