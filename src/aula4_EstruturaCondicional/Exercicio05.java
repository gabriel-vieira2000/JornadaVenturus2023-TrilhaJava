package aula4_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String nome;
		float salarioAtual, novoSalario, percentualAumento;
		int salarioAtualParaCondicao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome de um funcionário: ");
		nome = entrada.nextLine();
		System.out.println("Digite o salário atual desse funcionário: ");
		salarioAtual = entrada.nextFloat();
		
		salarioAtualParaCondicao = (int) salarioAtual/1000;
		
		switch(salarioAtualParaCondicao) {
			case 0,1,2,3:
				percentualAumento = 0.2f;
				break;
			case 4,5,6:
				percentualAumento = 0.15f;
				break;
			case 7,8,9:
				percentualAumento = 0.12f;
				break;
			case 10,11,12:
				percentualAumento = 0.10f;
				break;
			case 13,14,15:
				percentualAumento = 0.07f;
				break;
			default:
				percentualAumento = 0f;
				break;
		}
		
		novoSalario = salarioAtual * (1+percentualAumento);
		System.out.println("FUNCIONARIO: "+nome);
		System.out.println("% de aumento = "+(int)(percentualAumento*100)+"%");
		System.out.printf("Salario Atual = %.2f%n",salarioAtual);
		System.out.printf("Salario Atual = %.2f%n",novoSalario);
	}

}
