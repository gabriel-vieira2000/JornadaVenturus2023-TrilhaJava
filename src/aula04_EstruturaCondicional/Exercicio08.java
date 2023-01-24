package aula04_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		float massa, altura, imc;
		int imcEscolhaCaso;
		String classificacao1 = "", classificacao2 = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a massa de uma pessoa (em kg): ");
		massa = entrada.nextFloat();
		System.out.println("Digite a altura dela (em m): ");
		altura = entrada.nextFloat();
		
		imc = (float) (massa/Math.pow(altura, 2));
		
		if(imc < 16) {
			classificacao1 = "Magreza Grave";
		}else if(imc >= 16 && imc < 17) {
			classificacao1 = "Magreza Moderada";
		}else if(imc >= 17 && imc < 18.5) {
			classificacao1 = "Magreza Leve";
		}else if(imc >= 18.5 && imc < 25) {
			classificacao1 = "Saudavel";
		}else if(imc >= 25 && imc < 30) {
			classificacao1 = "Sobrepeso";
		}else if(imc >= 30 && imc < 35) {
			classificacao1 = "Obesidade Grau I";
		}else if(imc >= 35 && imc < 40) {
			classificacao1 = "Obesidade Grau II (severa)";
		}else {
			classificacao1 = "Obesidade Grau III (morbida)";
		}
		
		if(imc > 18 && imc < 19) {
			if(imc >= 18.5)
				imcEscolhaCaso = 19;
			else
				imcEscolhaCaso = 18;
		}else {
			imcEscolhaCaso = (int) Math.floor(imc);
		}
		
		switch(imcEscolhaCaso) {
			case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15:
				classificacao2 = "Magreza Grave";
				break;
			case 16:
				classificacao2 = "Magreza Moderada";
				break;
			case 17, 18:
				classificacao2 = "Magreza Leve";
				break;
			case 19, 20, 21, 22, 23, 24:
				classificacao2 = "Saudavel";
				break;
			case 25, 26, 27, 28, 29:
				classificacao2 = "Sobrepeso";
				break;
			case 30, 31, 32, 33, 34:
				classificacao2 = "Obesidade Grau I";
				break;
			case 35, 36, 37, 38, 39:
				classificacao2 = "Obesidade Grau II (severa)";
				break;
			default:
				classificacao2 = "Obesidade Grau III (morbida)";
				break;
		}
		
		System.out.println("IMC = "+imc);
		System.out.println("Classificacao do IMC pelo Se-Entao-Senao: "+classificacao1);
		System.out.println("Classificacao do IMC pelo Escolha-Caso: "+classificacao2);

	} 
	
}
