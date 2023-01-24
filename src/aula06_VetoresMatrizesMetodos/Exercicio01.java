package aula06_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		String alunos[] = {"Äna","Bruno","Matias","Carlos","Jose"};
		float notas[][] = new float[5][2];
		float mediaAlunos[] = new float[5];
		float mediaGeralTurma;
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Digite o nome do "+(i+1)+" aluno: ");
			alunos[i] = entrada.next();
			System.out.println("Digite a primeira nota desse aluno: ");
			notas[i][0] = entrada.nextFloat();
			System.out.println("Digite a segunda nota desse aluno: ");
			notas[i][1] = entrada.nextFloat();
			
			mediaAlunos[i] = calculaMediaAluno(notas,i);
		}
		entrada.close();
		mediaGeralTurma = calculaMediaGeralTurma(mediaAlunos);
		
		System.out.printf("MEDIA GERAL DA TURMA: %.1f%n",mediaGeralTurma);
		System.out.println("ALUNOS COM MEDIA MAIOR QUE A TURMA: "+alunosComMediaMaiorQueTurma(alunos,mediaAlunos,mediaGeralTurma));
	}
	
	
	public static float calculaMediaAluno(float notas[][], int indiceAluno) {
		return (notas[indiceAluno][0]+notas[indiceAluno][1])/2;
	}
	
	public static float calculaMediaGeralTurma(float mediaAlunos[]) {
		float mediaTurma = 0;
		for(int i=0;i<5;i++) {
			mediaTurma += mediaAlunos[i];
		}
		mediaTurma /= 5;
		return mediaTurma;
	}
	
	public static String alunosComMediaMaiorQueTurma(String alunos[], float mediaAlunos[], float mediaGeralTurma) {
		String alunosMediaMaior = "";
		for(int i=0; i<5;i++) {
			if(mediaAlunos[i] > mediaGeralTurma) {
				alunosMediaMaior += alunos[i] +"\t";
			}
		}
		return alunosMediaMaior;
	}

}
