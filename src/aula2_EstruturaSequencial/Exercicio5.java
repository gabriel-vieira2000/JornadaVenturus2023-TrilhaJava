package aula2_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int codigoPeca1, codigoPeca2;
		int quantidadePecas1, quantidadePecas2;
		float valorUnitarioPeca1, valorUnitarioPeca2, totalAPagar;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o código da peca 1: ");
		codigoPeca1 = entrada.nextInt();
		System.out.println("Digite a quantidade de pecas 1: ");
		quantidadePecas1 = entrada.nextInt();
		System.out.println("Digite o valor unitário de cada peca 1:");
		valorUnitarioPeca1 = entrada.nextFloat();
		
		System.out.println("Digite o código da peca 2: ");
		codigoPeca2 = entrada.nextInt();
		System.out.println("Digite a quantidade de pecas 2: ");
		quantidadePecas2 = entrada.nextInt();
		System.out.println("Digite o valor unitário de cada peca 2: ");
		valorUnitarioPeca2 = entrada.nextFloat();
		
		entrada.close();
		
		totalAPagar = quantidadePecas1 * valorUnitarioPeca1 + quantidadePecas2 * valorUnitarioPeca2;
		System.out.printf("VALOR A PAGAR: R$%.2f%n", totalAPagar);
	}

}
