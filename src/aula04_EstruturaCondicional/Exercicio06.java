package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int opcao;
		float valorDoacao = 0; 
		
		System.out.println("Bem-vindo ao Programa Solidario! Escolha uma das opcoes abaixo:");
		System.out.println("[1] para doar R$10");
		System.out.println("[2] para doar R$25");
		System.out.println("[3] para doar R$50");
		System.out.println("[4] para doar outros valores");
		System.out.println("[5] para cancelar");
	
		System.out.print("Opcao Escohida: ");
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			valorDoacao = 10;
			break;
		case 2:
			valorDoacao = 25;
			break;
		case 3:
			valorDoacao = 50;
			break;
		case 4:
			System.out.print("Digite o valor que deseja doar: ");
			valorDoacao = entrada.nextFloat();
			break;
		case 5:
			System.out.println("Programa Encerrado! Quem sabe em uma proxima oportunidade!");
			break;
		default:
			System.out.println("Opcao Invalida!!! Tente Novamente");
			break;
		}
		
		if(opcao <= 4 && opcao >= 1) {
			System.out.printf("Muito obrigado por doar R$%.2f para nossa causa!%n",valorDoacao);
		}

	}

}
