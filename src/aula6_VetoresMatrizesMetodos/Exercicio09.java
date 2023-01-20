package aula6_VetoresMatrizesMetodos;

public class Exercicio09 {

	public static void main(String[] args) {
		int numerosJogoMegaSena[] = new int[6];
		Random numerosAleatorios = new Random();
		
		for(int i=0; i<6;i++) {
			numerosJogoMegaSena = numerosAleatorios.nextInt(0,60);
		}

	}

}
