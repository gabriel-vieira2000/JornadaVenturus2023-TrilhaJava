package aula11_Polimorfismo.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List <Produto> prods = new ArrayList<>();
		List <ProdutoImportado> prodsI = new ArrayList<>();
		List <ProdutoUsado> prodsU = new ArrayList<>();
		
		int n, opc;
		String nome, dataFabricacao;
		float preco, taxaAlfandega;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos a serem etiquetados: ");
		n = entrada.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 - Produto");
			System.out.println("2 - Produto Importado");
			System.out.println("3 - Produto Usado");
			opc = entrada.nextInt();
			
			System.out.println("Digite o nome desse produto: ");
			nome = entrada.next();
			
			System.out.println("Digite o preco desse produto: ");
			preco = entrada.nextFloat();
			
			if(opc == 1) {
				prods.add(new Produto(nome, preco));
			}else if(opc == 2) {
				System.out.println("Digite o valor da taxa da alfandega: ");
				taxaAlfandega = entrada.nextFloat();
				prodsI.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}else {
				System.out.println("Digite a data de fabricacao: ");
				dataFabricacao = entrada.next();
				prodsU.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
		}
		
		for(int i=0; i<prods.size();i++) {
			prods.get(i).etiquetaPreco();
		}
		
		for(int i=0; i<prodsI.size();i++) {
			prodsI.get(i).etiquetaPreco();
		}
		
		for(int i=0; i<prodsU.size();i++) {
			prodsU.get(i).etiquetaPreco();
		}
		
	}

}
