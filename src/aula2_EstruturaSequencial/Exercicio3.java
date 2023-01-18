package aula2_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		a = entrada.nextInt();
		System.out.println("Digite o valor de B");
		b = entrada.nextInt();
		System.out.println("Digite o valor de C:");
		c = entrada.nextInt();
		System.out.println("Digite o valor de D:");
		d = entrada.nextInt();
		entrada.close();
		
		diferenca = a*b - c*d;
		System.out.println("DIFERENCA = "+diferenca);
	}

}
