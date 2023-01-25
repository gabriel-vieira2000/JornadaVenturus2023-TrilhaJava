package Exercicio05;

public class VetorUtils {
	
	public int menorValorVetor(int[] vetor) {
		int menorValor = Integer.MAX_VALUE;
		for(int i=0; i<vetor.length; i++) {
			menorValor = Integer.min(menorValor, vetor[i]);
		}
		return menorValor;
	}
	
	public int[] multiplicaVetorFator10(int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			vetor[i] *= 10;
		}
		return vetor;
	}
}
