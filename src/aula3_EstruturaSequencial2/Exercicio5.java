package aula3_EstruturaSequencial2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		double ladoA, ladoB, ladoC;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro lado de um triângulo qualquer: ");
		ladoA = entrada.nextDouble();
		System.out.println("Digite o primeiro lado de um triângulo qualquer: ");
		ladoB = entrada.nextDouble();
		System.out.println("Digite o primeiro lado de um triângulo qualquer: ");
		ladoC = entrada.nextDouble();
		entrada.close();
		
		System.out.println(((ladoA+ladoB)>ladoC && (ladoA+ladoC)>ladoB && (ladoB+ladoC)>ladoA ) ? "Esse triângulo existe!" : "Esse triângulo não existe!");
		System.out.println((ladoA==ladoB && ladoB==ladoC) ? "Ö triângulo é Equilátero" : "Ö triângulo não é Equilátero");
		System.out.println((ladoA!=ladoB && ladoB!=ladoC && ladoA != ladoC) ? "Ö triângulo é Escaleno" : "Ö triângulo não é Escaleno");
		System.out.println((!(ladoA==ladoB && ladoB==ladoC) && !(ladoA!=ladoB && ladoB!=ladoC && ladoA != ladoC)) ? "O triângulo é Isósceles" : "O triângulo não é Isósceles");
	}

}
