package aula7_ClassesEObjetos.Exercicio03;

public class Funcionario {
	float salario, percentualAumento;
	int anoAtual;
	
	void aumentoSalario() {
		if(anoAtual < 2018) {
			percentualAumento = 1.015f;
			salario = salario * percentualAumento;
		}else {
			percentualAumento = 1 + ((percentualAumento-1)*2);
			salario = salario*percentualAumento;
		}
	}
	
	void novoAno() {
		anoAtual++;
	}
	
	void apresentaSalario() {
		System.out.printf("O salario deste funcionario em %d eh R$%.2f %n",anoAtual,salario);
	}
}
