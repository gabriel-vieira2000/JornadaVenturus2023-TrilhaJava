package aula03_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		entrada.close();
		
		System.out.println((numero > 10) ? "Numero é maior que 10": (numero > 5) ? "Numero é maior que 5" : "Numero é menor que 5");
	}
}
