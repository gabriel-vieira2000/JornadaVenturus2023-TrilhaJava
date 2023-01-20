package aula6_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float matriz[][] = new float[3][3];
		float somaLinha3, somaColuna2;
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println("POSICAO ["+i+"]["+j+"]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		entrada.close();
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] +"\t");
			}
			System.out.println();
		}
		
		
		somaLinha3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
		somaColuna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
		
		System.out.println("SOMA DE TODOS ELEMENTOS: "+somaTodosElementos(matriz));
		System.out.println("SOMA DA LINHA 3: "+somaLinha3);
		System.out.println("SOMA DA COLUNA 2: "+somaColuna2);
		System.out.println("SOMA DA DIAGONAL PRINCIPAL: "+somaDiagonalPrincipal(matriz));
		
	}
	
	public static float somaTodosElementos(float matriz[][]) {
		float somaElementos = 0;
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				somaElementos += matriz[i][j];
			}
		}
		return somaElementos;
	}
	
	public static float somaDiagonalPrincipal(float matriz[][]) {
		float somaDiagonalPrincipal = 0;
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i == j) somaDiagonalPrincipal += matriz[i][j];
			}
		}
		return somaDiagonalPrincipal;
	}

}
