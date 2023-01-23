package aula7_ClassesEObjetos.Exercicio04;

public class MaterialRadioativo {
	float massaAtual;
	int tempoGasto = 0;
	
	void calculaTempoGastoDiminuicaoMassa() {
		while(massaAtual >= 0.5f) {
			massaAtual /= 2;
			tempoGasto += 50;
		}
	}
	
	void apresentaTempoGasto() {
		int tempoGasto = this.tempoGasto;
		int horas, minutos, segundos;
		horas = (int) tempoGasto/3600;
		tempoGasto = tempoGasto%3600;
		minutos = (int) tempoGasto/60;
		tempoGasto = tempoGasto%60;
		segundos = tempoGasto;
		
		System.out.printf("TEMPO GASTO PARA O MATERIAL CHEGAR A 0,5g: %dh:%dmin:%ds %n",horas,minutos,segundos);
		
	}
}
