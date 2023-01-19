package aula5_EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float x = -1, y = -1;
		
		Scanner entrada = new Scanner(System.in);
		while (x != 0f || y != 0f){
			System.out.println("Digite o valor da coordenada X: ");
			x = entrada.nextFloat();
			System.out.println("Digite o valor da coordenada Y: ");
			y = entrada.nextFloat();
			
			if(x != 0f || y != 0f) break;
			
			if(x > 0 && y > 0) {
				System.out.println("O ponto("+x+","+y+") esta no primeiro quadrante.");
			}else if( x <  0 && y > 0) {
				System.out.println("O ponto("+x+","+y+") esta no segundo quadrante.");
			}else if(x < 0 && y < 0) {
				System.out.println("O ponto("+x+","+y+") esta no terceiro quadrante.");
			}else {
				System.out.println("O ponto("+x+","+y+") esta no quarto quadrante.");
			}
		}
		entrada.close();
	}

}
