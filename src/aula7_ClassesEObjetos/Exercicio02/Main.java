package aula7_ClassesEObjetos.Exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		System.out.println("Digite a cotacao do dolar:");
		conversor.cotacaoDolar = entrada.nextFloat();
		System.out.println("Quantos dolares deseja comprar? ");
		conversor.valorEmDolares = entrada.nextFloat();
		
		conversor.calculaValorAPagarEmReais();
		conversor.calculaIOFAPagar();
		
		System.out.printf("VALOR EM DOLARES: %.2f %n", conversor.valorEmDolares);
		System.out.printf("VALOR EM REAIS A PAGAR: %.2f %n", conversor.valorEmReais);
		System.out.printf("VALOR DE IOF A PAGAR: %.2f %n", conversor.iof);
		System.out.printf("VALOR TOTAL DA COMPRA: %.2f %n", conversor.totalAPagar());

	}

}
