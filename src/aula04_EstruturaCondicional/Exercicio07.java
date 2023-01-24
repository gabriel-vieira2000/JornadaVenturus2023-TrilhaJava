package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		char opcao;
		float numero1, numero2, resultado = 0; 
		
		System.out.println("Calculadora Iniciada! Escolha uma das opcoes abaixo:");
		System.out.println("[+] para somar dois numeros");
		System.out.println("[-] para subtrair dois numeros");
		System.out.println("[*] para multiplicar dois numeros");
		System.out.println("[/] para dividir dois numeros (a/b)");
	
		System.out.print("Opcao Escohida: ");
		Scanner entrada = new Scanner(System.in);
		opcao = entrada.next().charAt(0);
		System.out.print("Primeiro numero: ");
		numero1 = entrada.nextFloat();
		System.out.print("Segundo numero: ");
		numero2 = entrada.nextFloat();
		
		switch(opcao) {
		case '+':
			resultado = numero1+numero2;
			break;
		case '-':
			resultado = numero1-numero2;
			break;
		case '*':
			resultado = numero1*numero2;
			break;
		case '/':
			resultado = numero1/numero2;
			break;
		default:
			System.out.println("Opcao Invalida!!! Tente Novamente");
			break;
		}
		
		if(opcao == '+' || opcao == '-' || opcao  == '*' || opcao == '/') {
			System.out.printf("Resultado da operacao entre os dois numeros = "+resultado);
		}

	}

}
