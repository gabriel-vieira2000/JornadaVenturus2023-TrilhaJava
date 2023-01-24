package aula05_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int n, contador = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n = entrada.nextInt();
		
		while(contador <= n) {
			if(n%contador == 0) {
				System.out.printf("O numero %d eh divisor de %d%n",contador,n);
			}
			contador++;
		}

	}

}
