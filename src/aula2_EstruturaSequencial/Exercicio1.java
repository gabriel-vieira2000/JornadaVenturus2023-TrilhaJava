package aula2_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero1, numero2, soma;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero1 = entrada.nextInt();
		System.out.println("Digite outro número: ");
		numero2 = entrada.nextInt();
		entrada.close();
		
		soma = numero1 + numero2;
		
		System.out.println("SOMA = "+soma);
	}
}
