package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero A: ");
		a = entrada.nextInt();
		System.out.println("Digite um numero B: ");
		b = entrada.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("Sao multiplos!");
		}else {
			System.out.println("Nao sao multiplos!");
		}

	}

}
