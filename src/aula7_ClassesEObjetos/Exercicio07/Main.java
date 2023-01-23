package aula7_ClassesEObjetos.Exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Estudante e1 = new Estudante();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		e1.nome = entrada.next();
		
		System.out.println("Digite a nota do primeiro trimestre (max 30): ");
		e1.notaTrimestre1 = entrada.nextFloat();
		System.out.println("Digite a nota do primeiro trimestre (max 35): ");
		e1.notaTrimestre2 = entrada.nextFloat();
		System.out.println("Digite a nota do primeiro trimestre (max 35): ");
		e1.notaTrimestre3 = entrada.nextFloat();
		
		System.out.println("ALUNO: "+e1.nome);
		System.out.println("NOTA FINAL DO ALUNO NO ANO: "+e1.notaFinalAno());
		e1.verificaSituacao();

	}

}
