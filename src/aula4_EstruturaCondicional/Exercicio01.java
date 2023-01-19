package aula4_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		entrada.close();
		
		if(numero%2 == 0) {
			System.out.println("O numero "+numero+" eh par!");
		}else {
			System.out.println("O numero "+numero+" eh impar!");
		}
	}
}
