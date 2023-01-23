package aula7_ClassesEObjetos.Exercicio03;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.salario = 2000f;
		f1.anoAtual = 2016;

		while(f1.anoAtual <= 2022) {
			f1.aumentoSalario();
			f1.apresentaSalario();
			f1.novoAno();
		}
	}

}
