package aula12_GenericsSetMap.Exercicio02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> alunos = new HashSet<>();
		int codigoAlunoCurso, numeroAlunosCurso;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quanto estudantes para o curso A? ");
		numeroAlunosCurso = entrada.nextInt();
		
		for(int i=0; i<numeroAlunosCurso; i++) {
			codigoAlunoCurso = entrada.nextInt();
			alunos.add(codigoAlunoCurso);
		}
		
		System.out.print("Quanto estudantes para o curso B? ");
		numeroAlunosCurso = entrada.nextInt();
		
		for(int i=0; i<numeroAlunosCurso; i++) {
			codigoAlunoCurso = entrada.nextInt();
			alunos.add(codigoAlunoCurso);
		}
		
		System.out.print("Quanto estudantes para o curso C? ");
		numeroAlunosCurso = entrada.nextInt();
		
		for(int i=0; i<numeroAlunosCurso; i++) {
			codigoAlunoCurso = entrada.nextInt();
			alunos.add(codigoAlunoCurso);
		}
		
		System.out.println("Total de Estudantes: "+alunos.size());
	}

}
