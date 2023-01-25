package aula13_ProgramacaoFuncional.Exercicio02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entradaCaminhoArquivo = new Scanner(System.in);
		System.out.println("Entre com o caminho: ");
		String caminhoArquivo = entradaCaminhoArquivo.next();
		
		File arquivo = new File(caminhoArquivo);
		Scanner entrada = null;
		
		try {
			entrada = new Scanner(arquivo);
			List<Produto> listaProdutos = new ArrayList<>();
			while(entrada.hasNext()) {
				String linhaArquivo = entrada.nextLine();
				String linhaArquivoDividida[] = linhaArquivo.split(",");
				listaProdutos.add(new Produto(linhaArquivoDividida[0],Float.parseFloat(linhaArquivoDividida[1])));
			}
			
			final float precoMedio = listaProdutos.stream()
					.reduce(0f, (somaPrecos, produto) -> somaPrecos + produto.getPreco(), Float::sum) 
					/ listaProdutos.stream().count();
			System.out.printf("Media preco: %.2f %n",precoMedio);
			
			listaProdutos.removeIf(p -> p.getPreco() > precoMedio);
			Comparator<Produto> comparacaoNomesProdutos = new ComparacaoNomesProdutos();
			listaProdutos.sort(comparacaoNomesProdutos);
			for(int i=0; i<listaProdutos.size();i++) {
				System.out.println(listaProdutos.get(i).getNome());
			}
			
		}catch(IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
		}finally {
			if(entrada != null) entrada.close();
		}
		

	}

}
