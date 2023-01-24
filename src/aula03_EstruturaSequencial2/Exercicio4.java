package aula03_EstruturaSequencial2;

public class Exercicio4 {

	public static void main(String[] args) {
		float wPontoFlutuante = 4f;
		int wInteiro = 4;

		wPontoFlutuante %= 3.33;
		wInteiro %= 3.33;
		
		System.out.println("O VALOR (PONTO FLUTUANTE) DE w%3.33 é = "+wPontoFlutuante); // Resposta: 0.67
		System.out.println("O VALOR (INTEIRO) DE w%3.33 é = "+wInteiro); // Resposta: 0 (Idem motivo do Exercicio 4)
	}

}
