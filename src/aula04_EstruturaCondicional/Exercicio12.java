package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		int i;
		double a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de I (entre 1 e 3):");
		i = entrada.nextInt();
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("I = "+i);
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		switch(i) {
		case 1:
			if (a < b && b < c) {
				System.out.println("Valores em ordem crescente: "+a+","+b+","+c);
			}else if (a > b && a < c && b < c) {
				System.out.println("Valores em ordem crescente: "+b+","+a+","+c);
			}else if (a < b && b > c && c > a) {
				System.out.println("Valores em ordem crescente: "+a+","+c+","+b);
			}else if (a < b && b > c && a > c) {
				System.out.println("Valores em ordem crescente: "+c+","+a+","+b);
			}else if(a > b && b < c) {
				System.out.println("Valores em ordem crescente: "+b+","+c+","+a);
			}else {
				System.out.println("Valores em ordem crescente: "+c+","+b+","+a);
			}
			break;
		case 2:
			if (a < b && b < c) {
				System.out.println("Valores em ordem decrescente: "+c+","+b+","+a);
			}else if (a > b && a < c && b < c) {
				System.out.println("Valores em ordem decrescente: "+c+","+a+","+b);
			}else if (a < b && b > c && c > a) {
				System.out.println("Valores em ordem decrescente: "+b+","+c+","+a);
			}else if (a < b && b > c && a > c) {
				System.out.println("Valores em ordem decrescente: "+b+","+a+","+c);
			}else if(a > b && b < c) {
				System.out.println("Valores em ordem decrescente: "+a+","+c+","+b);
			}else {
				System.out.println("Valores em ordem decrescente: "+a+","+b+","+c);
			}
			break;
		case 3:
			if(a > b && a > c) {
				System.out.println("Valores com maior no meio: "+b+","+a+","+c);
			}else if(c > a && c > b) {
				System.out.println("Valores com maior no meio: "+a+","+c+","+b);
			}else {
				System.out.println("Valores com maior no meio: "+a+","+b+","+c);
			}
			break;
		}
		
		

	}

}
