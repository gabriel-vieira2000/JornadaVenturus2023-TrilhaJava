package aula07_ClassesEObjetos.Exercicio07;

public class Estudante {
	String nome;
	float notaTrimestre1, notaTrimestre2, notaTrimestre3;
	
	float notaFinalAno() {
		return notaTrimestre1 + notaTrimestre2 + notaTrimestre3;
	}
	
	void verificaSituacao() {
		float minimoAprovacao = 60f;
	
		if(notaFinalAno() >= minimoAprovacao) {
			System.out.println("O ESTUDANTE ESTA APROVADO!");
		}else {
			System.out.println("O ESTUDANTE ESTA REPROVADO!");
			System.out.printf("FALTOU %.1f PONTOS PARA A APROVACAO! %n",(minimoAprovacao-notaFinalAno()));
		}
	}
}
