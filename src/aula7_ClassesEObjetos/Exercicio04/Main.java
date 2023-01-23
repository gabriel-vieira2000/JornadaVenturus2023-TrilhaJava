package aula7_ClassesEObjetos.Exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MaterialRadioativo mr1 = new MaterialRadioativo();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a massa de um determinado material radioativo (em gramas): ");
		mr1.massaAtual = entrada.nextFloat();
		mr1.calculaTempoGastoDiminuicaoMassa();
		mr1.apresentaTempoGasto();

	}

}
