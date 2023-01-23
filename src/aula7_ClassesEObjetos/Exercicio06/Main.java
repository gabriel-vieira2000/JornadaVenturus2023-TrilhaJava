package aula7_ClassesEObjetos.Exercicio06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome de um funcionario: ");
		f1.nome = entrada.next();
		System.out.println("Digite o salario bruto desse funcionario: ");
		f1.salarioBruto = entrada.nextFloat();
		System.out.println("Digite o percentual de imposto sobre esse salario:");
		f1.imposto = entrada.nextFloat();
		
		System.out.println("NOME DO FUNCIONARIO: "+f1.nome);
		System.out.printf("SALARIO LIQUIDO: R$%.2f %n",f1.salarioLiquido());
		
		System.out.println("Digite o percentual de aumento desse funcionario: ");
		float percentualAumento = entrada.nextFloat();
		f1.aumentoSalario(percentualAumento);
		
		System.out.println("NOME DO FUNCIONARIO: "+f1.nome);
		System.out.printf("SALARIO LIQUIDO: R$%.2f %n",f1.salarioLiquido());
	}
}
