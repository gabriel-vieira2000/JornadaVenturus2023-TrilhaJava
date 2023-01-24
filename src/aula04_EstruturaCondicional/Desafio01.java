package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		float preco, precoComAumento = 0, precoComDesconto;
		int categoria;
		char situacao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o preço de um produto: ");
		preco = entrada.nextFloat();
		System.out.println("Digite a categoria do produto (1 - Limpeza; 2 - Alimentacao; 3 - Vestuario):");
		categoria = entrada.nextInt();
		System.out.println("Digite a situacao do produto (R - produtos que necessitam de refrigeracao; N - produtos que nao necessitam de refrigeracao):");
		situacao = entrada.next().charAt(0);
		
		if(preco <= 25) {
			switch(categoria) {
			case 1:
				precoComAumento = preco*1.05f;
				break;
			case 2:
				precoComAumento = preco*1.08f;
				break;
			case 3:
				precoComAumento = preco*1.10f;
				break;
			}
		}else {
			switch(categoria) {
			case 1:
				precoComAumento = preco*1.12f;
				break;
			case 2:
				precoComAumento = preco*1.15f;
				break;
			case 3:
				precoComAumento = preco*1.18f;
				break;
			}
		}
		
		if(categoria == 2 || situacao == 'R') {
			precoComDesconto = precoComAumento * 0.95f;
		}else {
			precoComDesconto = precoComAumento * 0.92f; 
		}
		
		System.out.printf("Preco: R$%.2f%n",preco);
		System.out.printf("Preco com Aumento: R$%.2f%n",precoComAumento);
		System.out.printf("Preco com Desconto: R$%.2f%n",precoComDesconto);
		
		if(precoComDesconto <= 50) {
			System.out.println("Classificacao do Novo Preco: BARATO");
		}else if(precoComDesconto > 50 && precoComDesconto < 120) {
			System.out.println("Classificacao do Novo Preco: NORMAL");
		}else {
			System.out.println("Classificacao do Novo Preco: CARO");
		}
	}

}
