package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		float salario, percentualImposto, valorAPagarImposto; 
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu salario: ");
		salario = entrada.nextFloat();
		
		if(salario <= 1903.98) {
			percentualImposto = 0;
			valorAPagarImposto = 0;
		}else if(salario >= 1903.99 && salario <= 2826.65) {
			percentualImposto = 0.075f;
			valorAPagarImposto = salario*percentualImposto;
		}else if(salario >= 2826.66 && salario <= 3751.05) {
			percentualImposto = 0.15f;
			valorAPagarImposto = salario*percentualImposto;
		}else if(salario >= 3751.06 && salario <= 4664.68){
			percentualImposto = 0.225f;
			valorAPagarImposto = salario*percentualImposto;
		}else {
			percentualImposto = 0.275f;
			valorAPagarImposto = salario*percentualImposto;
		}
		
		System.out.printf("Salario: R$%.2f%n",salario);
		System.out.printf("Percentual de Imposto de Renda: %.1f%% %n",percentualImposto*100);
		System.out.printf("Valor de Imposto a Pagar: R$%.2f%n",valorAPagarImposto);

	}

}
