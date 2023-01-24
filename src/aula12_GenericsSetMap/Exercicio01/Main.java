package aula12_GenericsSetMap.Exercicio01;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set <String> usuarios = new HashSet<>();
		String linhaLog, caminhoArquivo;
		int ponteiroLeituraLog = 0;
		Scanner entrada = null;
		Scanner entradaCaminhoArquivo = new Scanner(System.in);
		
		System.out.print("Entre com o caminho: ");
		caminhoArquivo = entradaCaminhoArquivo.nextLine();
		File arquivo = new File(caminhoArquivo);
		
		
		try {
			entrada = new Scanner(arquivo);
			while(entrada.hasNext()) {
				linhaLog = entrada.next();
				if(ponteiroLeituraLog%2 == 0) {
					usuarios.add(linhaLog);
				}
				ponteiroLeituraLog++;
			}
		}catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
		}finally {
			if (entrada != null) {
				entrada.close();
			}
		}
		
		System.out.println("Total Users: "+usuarios.size());
	}
}
