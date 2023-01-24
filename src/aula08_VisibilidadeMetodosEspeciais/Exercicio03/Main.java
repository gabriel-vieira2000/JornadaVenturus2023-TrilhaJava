package aula08_VisibilidadeMetodosEspeciais.Exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um numero: ");
		n = entrada.nextInt();
		
		operacaoMatematica om = new operacaoMatematica();
		om.n = n; // Quando o atributo n é protected a classe main consegue acessá-lo,
				  // mas quando n é private é impossível acessá-lo diretamente fora de sua classe
		om.parOuImpar();
		om.negativoOuPositivo();
	}

}
