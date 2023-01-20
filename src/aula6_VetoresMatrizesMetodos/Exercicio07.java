package aula6_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio07 {
	
	static float vetor[] = new float[10];

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Digite o elemento "+i+":");
			vetor[i] = entrada.nextFloat();
		}
		entrada.close();
		
		ordenaVetor();
		
		System.out.print("VETOR ORDENADO: ");
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i] +" ");
		}
	}
	
	public static void ordenaVetor() {
		float aux;
		
		for(int i=0;i<vetor.length;i++) {
			for(int j=0; j<vetor.length;j++) {
				if(i != j) {
					if(vetor[j] > vetor[i]) {
						aux = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = aux;
					}
				}
			}
		}
		
	}

}
