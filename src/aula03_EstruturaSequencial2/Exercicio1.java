package aula03_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de x: ");
		x = entrada.nextInt();
		entrada.close();
		
		x *= 5;
		
		System.out.println("VALOR FINAL DE x = "+x);

	}

}
