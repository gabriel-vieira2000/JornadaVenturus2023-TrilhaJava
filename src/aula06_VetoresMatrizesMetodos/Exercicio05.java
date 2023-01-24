package aula06_VetoresMatrizesMetodos;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		
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
		System.out.println("-------");
		
		matriz = matrizSemValoresNegativos(matriz);
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] +"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[][] matrizSemValoresNegativos(int matriz[][]){
		int novaMatriz[][] = matriz;
		
		for(int i=0; i<novaMatriz.length;i++) {
			for(int j=0;j<novaMatriz[i].length;j++) {
				if(novaMatriz[i][j] < 0) {
					novaMatriz[i][j] = 0;
				}
			}
		}
		
		return novaMatriz;
	}

}
