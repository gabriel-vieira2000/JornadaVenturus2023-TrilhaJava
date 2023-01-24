package aula03_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		float y;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de y: ");
		y = entrada.nextFloat();
		entrada.close();
		
		y /= 3;
		
		System.out.println("VALOR DE y/3 = "+y);
	}
}
