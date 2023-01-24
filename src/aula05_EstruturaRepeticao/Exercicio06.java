package aula05_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo: ");
		x = entrada.nextInt();
		for(int i=1; i<=x;i++) {
			System.out.printf("Linha n %d: %d^2 = %.1f, %d^3 = %.1f %n",i,i,Math.pow(i, 2),i,Math.pow(i, 3));
		}
		entrada.close();
	}

}
