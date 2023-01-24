package aula11_Polimorfismo.Exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, opc;
		String nome;
		int horas;
		float valorPorHora;
		List <Funcionario> funcionarios = new ArrayList<>();
		List <FuncionarioTercerizado> funcionariosTercerizados = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funcionarios que deseja cadastrar: ");
		n = entrada.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Escolha uma opcao: ");
			System.out.println("1 - Funcionario");
			System.out.println("2 - Funcionario Tercerizado");
			opc = entrada.nextInt();
			
			System.out.println("Digite o nome desse(a) funcionario(a): ");
			nome = entrada.next();
			
			System.out.println("Digite a quantidade de horas que ele trabalhou: ");
			horas = entrada.nextInt();
			
			System.out.println("Digite o valor por hora dele(a): ");
			valorPorHora = entrada.nextFloat();
			
			if(opc == 1) {
				funcionarios.add(new Funcionario(nome, horas, valorPorHora));
			}else {
				funcionariosTercerizados.add(new FuncionarioTercerizado(nome, horas, valorPorHora));
			}
		}
		
		for(int i=0; i<funcionarios.size(); i++) {
			System.out.println("NOME: "+funcionarios.get(i).getNome());
			funcionarios.get(i).pagamento();
		}
		
		for(int i=0; i<funcionariosTercerizados.size(); i++) {
			System.out.println("NOME: "+funcionariosTercerizados.get(i).getNome());
			funcionariosTercerizados.get(i).pagamento();
		}
	}

}
