package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		double valor;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor qualquer: ");
		valor = entrada.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.println("Esse valor estah no intervalo [0,25]");
		}else if(valor > 25 && valor <= 50) {
			System.out.println("Esse valor estah no intervalo (25,50]");
		}else if(valor > 50 && valor <= 75) {
			System.out.println("Esse valor estah no intervalo (50,75]");
		}else if(valor > 75 && valor <= 100) {
			System.out.println("Esse valor estah no intervalo (75,100]");
		}else {
			System.out.println("Fora de intervalo");
		}

	}

}
