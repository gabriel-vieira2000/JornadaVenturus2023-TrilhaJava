package aula3_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double numero1, numero2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero1 = entrada.nextDouble();
		System.out.println("Digite outro número: ");
		numero2 = entrada.nextDouble();
		entrada.close();
		
		System.out.println((numero1 > numero2) ? "A soma dos dois números é = "+(numero1+numero2) : "A subtracao dos dois números é = "+(numero1-numero2));
		
	}
}
