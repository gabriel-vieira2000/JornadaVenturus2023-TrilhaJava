package aula09_Encapsulamento.Exercicio03;

public class Main {

	public static void main(String[] args) {
		LinguagemPrograma programador1 = new LinguagemPrograma("Maria","Python",15);
		LinguagemPrograma programador2 = new LinguagemPrograma("Joao","Java",10);
		
		System.out.println("-------");
		programador1.pessoa();
		programador1.linguagemProgramacao();
		programador1.experiencia();
		System.out.println("-------");
		programador2.pessoa();
		programador2.linguagemProgramacao();
		programador2.experiencia();

	}

}
