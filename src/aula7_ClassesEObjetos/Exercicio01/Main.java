package aula7_ClassesEObjetos.Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores dos tres lados do primeiro triangulo: ");
		t1.ladoA = entrada.nextFloat();
		t1.ladoB = entrada.nextFloat();
		t1.ladoC = entrada.nextFloat();
		System.out.println("Digite os valores dos tres lados do segundo triangulo: ");
		t2.ladoA = entrada.nextFloat();
		t2.ladoB = entrada.nextFloat();
		t2.ladoC = entrada.nextFloat();
		
		System.out.printf("AREA DO TRIANGULO 1: %.1f %n",t1.area());
		System.out.printf("AREA DO TRIANGULO 2: %.1f %n",t2.area());
		
		if(t1.area() > t2.area()) {
			System.out.println("A AREA DO TRIANGULO 1 EH MAIOR QUE DO TRIANGULO 2");
		}else if(t1.area() == t2.area()) {
			System.out.println("AREAS IGUAIS");
		}else {
			System.out.println("A AREA DO TRIANGULO 2 EH MAIOR QUE DO TRIANGULO 1");
		}
	}

}
