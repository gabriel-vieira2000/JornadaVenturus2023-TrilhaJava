package aula02_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int numeroFuncionario, horasTrabalhadas;
		float valorHoraTrabalhada, salario;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de um funcionário: ");
		numeroFuncionario = entrada.nextInt();
		System.out.println("Digite quanto ele recebe por hora: ");
		valorHoraTrabalhada = entrada.nextFloat();
		System.out.println("Digite quantas horas ele trabalhou; ");
		horasTrabalhadas = entrada.nextInt();
		entrada.close();
		
		salario = valorHoraTrabalhada * horasTrabalhadas;
		System.out.println("NUMERO = "+numeroFuncionario+" SALARIO = "+salario);
		
	}

}
