package aula08_VisibilidadeMetodosEspeciais.Exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Produto p[] = new Produto[5];
		p[0] = new Produto(1, "Cachorro-Quente", 7.0f);
		p[1] = new Produto(2, "X-Salada", 9.0f);
		p[2] = new Produto(3, "X-Bacon", 11.0f);
		p[3] = new Produto(4, "Torrada", 5.0f);
		p[4] = new Produto(5, "Refrigerante", 4.0f);
		
		int codigo = -1, quantidade;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("SELECIONE A OPCAO ABAIXO PARA COMPRAR O PRODUTO: ");
			for(int i=0; i<p.length;i++) {
				System.out.println("["+i+"] - para comprar "+p[i].getNomeProduto());
			}
			System.out.println("6 - para finalizar compra");
			codigo = entrada.nextInt();
			if(codigo >= 0 && codigo < 6) {
				System.out.println("Digite a quantidade de "+p[codigo].getNomeProduto()+" que deseja comprar");
				quantidade = entrada.nextInt();
				p[codigo].setQuantidade(p[codigo].getQuantidade()+quantidade);
			}
		}while(codigo != 6);
		
		float precoTotal = 0;
		for(int i=0; i<p.length;i++) {
			precoTotal += p[i].getPreco()*p[i].getQuantidade();
		}
		System.out.printf("VALOR TOTAL DA CONTA A PAGAR: R$%.2f",precoTotal);
	}

}
