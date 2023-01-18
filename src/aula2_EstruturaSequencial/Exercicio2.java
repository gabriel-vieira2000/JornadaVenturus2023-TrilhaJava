package aula2_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		float raioCirculo, areaCirculo;
		float pi = 3.14159f;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor de raio de um círculo qualquer:");
		raioCirculo = entrada.nextFloat();
		entrada.close();
		
		areaCirculo = (raioCirculo*raioCirculo) * pi;
		System.out.println("A(Área do Círculo) = "+areaCirculo);
	}
}
