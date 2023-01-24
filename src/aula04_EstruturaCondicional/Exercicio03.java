package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float salario, financiamentoPretendido;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		salario = entrada.nextFloat();
		System.out.println("Digite o valor do financiamento que deseja realizar: ");
		financiamentoPretendido = entrada.nextFloat();
		entrada.close();
		
		if(financiamentoPretendido <= (5*salario)) {
			System.out.println("FINANCIAMENTO CONCEDIDO!");
		}else {
			System.out.println("FINANCIAMENTO NEGADO!");	
		}

	}

}
