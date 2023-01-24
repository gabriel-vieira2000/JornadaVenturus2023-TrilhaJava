package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota de um aluno na matéria: ");
		nota1 = entrada.nextFloat();
		System.out.println("Digite a segunda nota de um aluno na matéria: ");
		nota2 = entrada.nextFloat();
		System.out.println("Digite a terceira nota de um aluno na matéria: ");
		nota3 = entrada.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		if(media >= 7) {
			System.out.printf("Esse aluno esta aprovado! MEDIA = %.1f%n",media);
		}else if(media >= 5) {
			System.out.printf("Esse aluno esta de recuperacao! MEDIA = %.1f%n",media);
		}else {
			System.out.printf("Esse aluno esta reprovado! MEDIA = %.1f%n",media);
		}
	}

}
