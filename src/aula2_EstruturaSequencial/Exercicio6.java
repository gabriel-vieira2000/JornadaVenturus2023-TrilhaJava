package aula2_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		entrada.close();
		
		triangulo = a*c/2;
		circulo = (c*c)*3.1415;
		trapezio = ((a+b)*c)/2;
		quadrado = b*b;
		retangulo = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);

	}

}
