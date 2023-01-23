package aula6_VetoresMatrizesMetodos;

import java.util.Random;

public class Exercicio09 {

	public static void main(String[] args) {
		int numerosJogoMegaSena[] = new int[6];
		Random numerosAleatorios = new Random();
		
		for(int i=0; i<6;i++) {
			numerosJogoMegaSena[i] = numerosAleatorios.nextInt(0,60);
		}
		
		System.out.print("JOGO DE MEGA SENA GERADO: ");
		for(int i=0; i<6; i++) {
			System.out.print(numerosJogoMegaSena[i] + "\t");
		}

	}

}
