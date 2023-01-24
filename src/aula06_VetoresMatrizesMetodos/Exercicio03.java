package aula06_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("O numero "+numero+" eh "+verificaNumeroEhParOuImpar(numero));
		

	}
	
	public static String verificaNumeroEhParOuImpar(int numero) {
		if(numero%2 == 0) {
			return "par";
		}else {
			return "impar";
		}
	}

}
