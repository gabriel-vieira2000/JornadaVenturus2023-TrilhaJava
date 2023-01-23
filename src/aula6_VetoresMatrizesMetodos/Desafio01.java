package aula6_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		String candidatos[] = new String[5];
		int votosCandidatos[] = new int[5];
		int maisVotos = 0, candidatoMaisVotos = 0, votoAtual, totalVotos = 0;
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Digite o nome do candidato "+(i+1)+":");
			candidatos[i] = entrada.next();
		}
		
		do {
			System.out.println("Bem-vindo ao Programa de Eleicao, escolha o numero de um dos candidatos abaixo para votar: ");
			for(int i=0;i<5;i++) {
				System.out.println("["+i+"] - Voto para "+candidatos[i]);
			}
			System.out.println("[-1] - Encerrar a votacao");
			votoAtual = entrada.nextInt();
			
			if(votoAtual >= 0 && votoAtual <=4) {
				votosCandidatos[votoAtual]++;
				if(votosCandidatos[votoAtual] > maisVotos) {
					candidatoMaisVotos = votoAtual;
					maisVotos = votosCandidatos[votoAtual];
				}
				totalVotos++;
			}else if(votoAtual != -1) {
				System.out.println("VOTO INVALIDO!");
			}
		}while(votoAtual != -1);
		
		System.out.println("APURACAO: ");
		System.out.println("TOTAL DE VOTOS: "+totalVotos);
		for(int i=0; i<5; i++) {
			System.out.println("CANDIDATO "+candidatos[i]+" - VOTOS: "+votosCandidatos[i]);
		}
		System.out.println("VENCEDOR DA ELEICAO: "+candidatos[candidatoMaisVotos]);
		
	}

}
