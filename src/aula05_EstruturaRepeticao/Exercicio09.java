package aula05_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		float massaAtual;
		int tempoTranscorrido = 0;
		int horasGastas, minutosGastos, segundosGastos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a massa de um material radioativo:");
		massaAtual = entrada.nextFloat();
		
		while(massaAtual > 0.5f) {
			massaAtual /= 2;
			tempoTranscorrido += 50;
		}
		
		horasGastas = (int)(tempoTranscorrido/3600);
		tempoTranscorrido = (tempoTranscorrido%3600);
		minutosGastos = (int)(tempoTranscorrido/60);
		tempoTranscorrido = (tempoTranscorrido%60);
		segundosGastos = tempoTranscorrido;
		
		System.out.printf("A massa do material radioativo ficou menor do que 0.5 grama em aproximadamente: %dh:%dmin:%ds",horasGastas,minutosGastos,segundosGastos);
	}
}
