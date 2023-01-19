package aula5_EstruturaRepeticao;

public class Exercicio07 {

	public static void main(String[] args) {
		float salarioBase = 2000f, salarioNoAno = 2000f, aumento = 1.5f;
		int anoAtual = 2010;
		
		System.out.printf("O salario atual do funcionario no ano de %d foi(eh): %.2f %n", anoAtual, salarioNoAno);
		
		for(anoAtual = 2011; anoAtual <= 2022; anoAtual++) {
			salarioNoAno = salarioBase*aumento;
			System.out.printf("O salario atual do funcionario no ano de %d foi(eh): %.2f %n", anoAtual, salarioNoAno);
			aumento *= 2;
		}
		

	}

}
