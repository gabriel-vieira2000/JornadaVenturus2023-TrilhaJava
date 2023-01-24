package aula12_GenericsSetMap.Exercicio03;

import java.io.File;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map <String, Integer> votosCandidato = new HashMap<>();
		String linhaVotacao, caminhoArquivo;
		String linhaVotacaoDividida[] = new String[2];
		Scanner entrada = null;
		Scanner entradaCaminhoArquivo = new Scanner(System.in);
		
		System.out.print("Entre com o caminho: ");
		caminhoArquivo = entradaCaminhoArquivo.nextLine();
		File arquivo = new File(caminhoArquivo);
		
		
		try {
			entrada = new Scanner(arquivo);
			while(entrada.hasNextLine()) {
				linhaVotacao = entrada.nextLine();
				linhaVotacaoDividida = linhaVotacao.split(",");
				
				if(votosCandidato.containsKey(linhaVotacaoDividida[0])) {
					Integer votosCandidatoAnterior = votosCandidato.get(linhaVotacaoDividida[0]);
					votosCandidato.put(linhaVotacaoDividida[0], votosCandidatoAnterior + Integer.parseInt(linhaVotacaoDividida[1]));
				}else {
					votosCandidato.put(linhaVotacaoDividida[0], Integer.parseInt(linhaVotacaoDividida[1]));
				}
			}
		}catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
		}finally {
			if (entrada != null) {
				entrada.close();
			}
		}
		
		for (String candidato : votosCandidato.keySet()) {
			System.out.println(candidato+": "+votosCandidato.get(candidato));
		}
	}
}
