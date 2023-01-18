package aula3_EstruturaSequencial2;

public class Exercicio3 {

	public static void main(String[] args) {
		float yPontoFlutuante = 5f;
		int yInteiro = 5;
		
		yPontoFlutuante /= 3.0f;
		yInteiro /= 3.0f;
		
		System.out.println("VALOR (PONTO FLUTANTE) DE y=5/3 = "+yPontoFlutuante); //RESULTADO PRINTADO: 1.666666
		System.out.println("VALOR (INTEIRO) DE y=5/3 = "+yInteiro); //RESULTADO PRINTADO: 1 (como nesse espaco de memória só "cabe" valores inteiros, a parcela decimal da divisao é descartada)
	}

}
