package aula10_Heranca.Exercicio02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int nRetangulos, nCirculos;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Retangulos que deseja cadastrar: ");
		nRetangulos = entrada.nextInt();
		Retangulo rets[] = new Retangulo[nRetangulos];
		
		System.out.println("Digite a quantidade de Circulos que deseja cadastrar: ");
		nCirculos = entrada.nextInt();
		Circulo circs[] = new Circulo[nCirculos];
		
		float largura, altura, raio;
		int cor;
		for(int i=0;i<rets.length;i++) {
			System.out.println("Digite a largura do retangulo "+(i+1)+":");
			largura = entrada.nextFloat();
			System.out.println("Digite a altura do retangulo "+(i+1)+":");
			altura = entrada.nextFloat();
			System.out.println("Digite a cor do retangulo "+(i+1)+" (1 - Preto, 2 - Azul, 3 - Vermelho):");
			cor = entrada.nextInt();
			
			if(cor == 1) {
				rets[i] = new Retangulo(largura, altura, Cor.BLACK);
			}else if(cor == 2) {
				rets[i] = new Retangulo(largura, altura, Cor.BLUE);
			}else {
				rets[i] = new Retangulo(largura, altura, Cor.RED);
			}
		}
		
		for(int i=0;i<circs.length;i++) {
			System.out.println("Digite o raio do circulo "+(i+1)+":");
			raio = entrada.nextFloat();
			System.out.println("Digite a cor do circulo "+(i+1)+" (1 - Preto, 2 - Azul, 3 - Vermelho):");
			cor = entrada.nextInt();
			
			if(cor == 1) {
				circs[i] = new Circulo(raio, Cor.BLACK);
			}else if(cor == 2) {
				circs[i] = new Circulo(raio, Cor.BLUE);
			}else {
				circs[i] = new Circulo(raio, Cor.RED);
			}
		}
		
		for(int i=0;i<rets.length;i++) {
			System.out.println(rets[i].toString());
		}
		
		for(int i=0;i<circs.length;i++) {
			System.out.println(circs[i].toString());
		}
	}
}
