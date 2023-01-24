package aula07_ClassesEObjetos.Exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Retangulo ret1 = new Retangulo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da largura de um retangulo: ");
		ret1.largura = entrada.nextFloat();
		System.out.println("Digite o valor da altura de um retangulo: ");
		ret1.altura = entrada.nextFloat();
		
		System.out.printf("AREA DESSE RETANGULO: %.1f %n",ret1.area());
		System.out.printf("PERIMETRO DESSE RETANGULO: %.1f %n",ret1.perimetro());
		System.out.printf("DIAGONAL DESSE RETANGULO: %.1f %n",ret1.diagonal());

	}

}
