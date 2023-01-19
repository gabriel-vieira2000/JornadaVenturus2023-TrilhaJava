package aula5_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int numero;
		boolean ehPrimo = true;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro qualquer: ");
		numero = entrada.nextInt();
		
		for(int i=2; i<numero; i++) {
			if(numero%i==0) {
				ehPrimo = false;
			}
		}
		
		if(ehPrimo) {
			System.out.println("O numero "+numero+" eh primo!");
		}else {
			System.out.println("O numero "+numero+" nao eh primo!");
		}

	}

}
