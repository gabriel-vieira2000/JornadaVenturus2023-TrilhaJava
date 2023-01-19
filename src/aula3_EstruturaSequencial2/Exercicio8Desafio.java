package aula3_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio8Desafio {

	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira constante da fórmula quadrática (ax2): ");
		a = entrada.nextDouble();
		System.out.println("Digite a segunda constante da fórmula quadrática (bx): ");
		b = entrada.nextDouble();
		System.out.println("Digite a constante da fórmula quadrática (c): ");
		c = entrada.nextDouble();
		entrada.close();
		
		
		delta = (b*b) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta))/2*a;
		x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println((delta >= 0) ? "Raízes: x1 = "+x1+"; x2 = "+x2 : "Delta negativo, logo não há raízes!");	
	}
}
