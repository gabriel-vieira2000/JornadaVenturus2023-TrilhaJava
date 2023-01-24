package aula06_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		String times[] = new String[10];
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Digite o nome do time "+(i+1)+":");
			times[i] = entrada.next();
		}
		entrada.close();
		geraTabelaJogosCampeonato(times);

	}
	
	public static void geraTabelaJogosCampeonato(String times[]) {
		for(int i=0; i<times.length; i++) {
			for(int j=0;j<times.length; j++) {
				if(i != j) {
					System.out.println("JOGO: "+times[i]+" x "+times[j]);
				}
			}
		}
	}

}
