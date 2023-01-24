package aula06_VetoresMatrizesMetodos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Random rand = new Random();
		int numeroCerto = rand.nextInt(0,100);
		int numeroChute;
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Tente acertar um numero de 0 a 100: ");
			numeroChute = entrada.nextInt();
			
			if(numeroChute < numeroCerto) System.out.println("O numero correto eh maior que esse!");
			else if(numeroChute > numeroCerto) System.out.println("Ö numero correto eh menor que esse!");
		}while(numeroChute != numeroCerto);
		
		System.out.println("Parabens! Voce descobriu o numero!!!");
	}

}
