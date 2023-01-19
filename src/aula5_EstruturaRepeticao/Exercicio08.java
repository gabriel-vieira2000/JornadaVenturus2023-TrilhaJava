package aula5_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		String nomeAluno;
		float nota1, nota2, mediaTurma = 0, mediaAluno;
		
		Scanner entrada = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("Digite o nome de um aluno: ");
			nomeAluno = entrada.next();
			System.out.println("Digite a primeira nota: ");
			nota1 = entrada.nextFloat();
			System.out.println("Digite a segunda nota: ");
			nota2 = entrada.nextFloat();
			
			mediaAluno = (nota1+nota2)/2;
			if(mediaAluno >= 6.0f) {
				System.out.println(nomeAluno+" estah aprovado!");
			}else {
				System.out.println(nomeAluno+" estah reprovado!");
			}
			mediaTurma += mediaAluno;
		}
		mediaTurma /= 3;
		System.out.printf("Media Geral da Turma: %.1f",mediaTurma);
		entrada.close();
	}
}
