package aula05_EstruturaRepeticao;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		String candidato1, candidato2, candidato3, candidato4, candidato5;
		int votos1 = 0, votos2 = 0, votos3 = 0, votos4 = 0, votos5 = 0, totalVotos = 0, maisVotos = 0;
		String candidatoMaisVotos = "";
		int opcao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do candidato 1: ");
		candidato1 = entrada.next();
		System.out.println("Digite o nome do candidato 2: ");
		candidato2 = entrada.next();
		System.out.println("Digite o nome do candidato 3: ");
		candidato3 = entrada.next();
		System.out.println("Digite o nome do candidato 4: ");
		candidato4 = entrada.next();
		System.out.println("Digite o nome do candidato 5: ");
		candidato5 = entrada.next();
		
		do {
			System.out.println("VOTACAO LIDER DE TURMA");
			System.out.println("[1] - Votar em "+candidato1);
			System.out.println("[2] - Votar em "+candidato2);
			System.out.println("[3] - Votar em "+candidato3);
			System.out.println("[4] - Votar em "+candidato4);
			System.out.println("[5] - Votar em "+candidato5);
			System.out.println("[0] - Encerra Votacao");
			System.out.print("Digite sua opcao: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1: 
				votos1++;
				if(votos1 > maisVotos) {
					candidatoMaisVotos = candidato1;
					maisVotos = votos1;
				}else if(votos1 == maisVotos) {
					candidatoMaisVotos = "Empate";
				}
				totalVotos++;
				break;
			case 2: 
				votos2++;
				if(votos2 > maisVotos) {
					candidatoMaisVotos = candidato2;
					maisVotos = votos2;
				}else if(votos2 == maisVotos) {
					candidatoMaisVotos = "Empate";
				}
				totalVotos++;
				break;
			case 3: 
				votos3++;
				if(votos3 > maisVotos) {
					candidatoMaisVotos = candidato3;
					maisVotos = votos3;
				}else if(votos3 == maisVotos) {
					candidatoMaisVotos = "Empate";
				}
				totalVotos++;
				break;
			case 4:
				votos4++;
				if(votos4 > maisVotos) {
					candidatoMaisVotos = candidato4;
					maisVotos = votos4;
				}else if(votos4 == maisVotos) {
					candidatoMaisVotos = "Empate";
				}
				totalVotos++;
				break;
			case 5:
				votos5++;
				if(votos5 > maisVotos) {
					candidatoMaisVotos = candidato5;
					maisVotos = votos5;
				}else if(votos5 == maisVotos) {
					candidatoMaisVotos = "Empate";
				}
				totalVotos++;
				break;
			case 0:
				break;
			default:
				System.out.println("Voto Invalido!");
				break;
			}
			
		}while(opcao != 0);
		
		System.out.println("APURACAO DA ELEICAO");
		System.out.printf("Candidato %s - Total de Votos: %d %n",candidato1,votos1);
		System.out.printf("Candidato %s - Total de Votos: %d %n",candidato2,votos2);
		System.out.printf("Candidato %s - Total de Votos: %d %n",candidato3,votos3);
		System.out.printf("Candidato %s - Total de Votos: %d %n",candidato4,votos4);
		System.out.printf("Candidato %s - Total de Votos: %d %n",candidato5,votos5);
		System.out.println("Total de Votos: "+totalVotos);
		System.out.println("Candidato Eleito: "+candidatoMaisVotos);
		
	}

}
