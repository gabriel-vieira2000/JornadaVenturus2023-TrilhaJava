package aula05_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		String senhaDigitada;
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("Insira a senha: ");
			senhaDigitada = entrada.next();
			
			if(!senhaDigitada.equals("2023")) {
				System.out.println("Senha Invalida! Tente novamente.");
			}
			
		}while(!senhaDigitada.equals("2023"));
		
		System.out.println("Acesso Permitido!");

	}

}
