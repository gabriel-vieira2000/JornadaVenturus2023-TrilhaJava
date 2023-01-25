package aula13_ProgramacaoFuncional.Exercicio03;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner entradaCaminhoArquivo = new Scanner(System.in) ; 
		Scanner entradaSalario = new Scanner(System.in);
		
		System.out.println("Entre com o caminho: ");
		String caminhoArquivo = entradaCaminhoArquivo.next();
		File arquivo = new File(caminhoArquivo);
		Scanner entrada = null;
		
		System.out.println("Entre salario: ");
		float salarioEntrada = entradaSalario.nextFloat();
		final float salario = salarioEntrada;
		
		entradaCaminhoArquivo.close();
		entradaSalario.close();
		
		try {
			entrada = new Scanner(arquivo);
			List<Funcionario> listaFuncionarios = new ArrayList<>();
			while(entrada.hasNext()) {
				String linhaArquivo = entrada.nextLine();
				String linhaArquivoDividida[] = linhaArquivo.split(",");
				listaFuncionarios.add(new Funcionario(linhaArquivoDividida[0],linhaArquivoDividida[1],Float.parseFloat(linhaArquivoDividida[2])));
			}
			
			
			
			List<Funcionario> listaFuncionariosFiltrada = listaFuncionarios.stream()
																			.filter(f -> f.getSalario() > salario)
																			.collect(Collectors.toList());
			
			Comparator<Funcionario> emailsOrdemAlfabetica = (f1,f2) -> f1.getEmail().toUpperCase().compareTo(f2.getEmail().toUpperCase());
			listaFuncionariosFiltrada.sort(emailsOrdemAlfabetica);
			System.out.println("Email cujo salario e maior que 2000.00: ");
			for(int i=0; i<listaFuncionariosFiltrada.size();i++) {
				System.out.println(listaFuncionariosFiltrada.get(i).getEmail());
			}
			
			Predicate<Funcionario> nomesComInicialM = f -> f.getNome().charAt(0) == 'M';
			float somaSalarios = listaFuncionarios.stream()
								 .filter(nomesComInicialM)
								 .reduce(0f, (soma, funcionario) -> soma + funcionario.getSalario(), Float::sum);
			System.out.println("Soma dos salarios das pessoas com nomes que iniciam com 'M': ");
			System.out.printf("%.2f %n",somaSalarios);
			
		}catch(IOException e) {
			System.out.println("Erro ao ler o arquivo: "+e.getMessage());
		}finally {
			if(entrada != null) entrada.close();
		}
	}
}
