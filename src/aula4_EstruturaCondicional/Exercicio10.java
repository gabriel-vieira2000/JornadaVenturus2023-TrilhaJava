package aula4_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int horaInicialJogo, horaFinalJogo, duracaoJogo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a hora inicial de um jogo: ");
		horaInicialJogo = entrada.nextInt();
		System.out.println("Digite a hora final de um jogo: ");
		horaFinalJogo = entrada.nextInt();
		
		if(horaFinalJogo < horaInicialJogo) {
			duracaoJogo = 24 - (horaInicialJogo - horaFinalJogo);
		}else {
			duracaoJogo = horaFinalJogo - horaInicialJogo;
		}
		
		System.out.println("Duracao do Jogo: "+duracaoJogo+" horas");

	}

}
