package aula07_ClassesEObjetos.Exercicio06;

public class Funcionario {
	String nome;
	float salarioBruto, imposto;
	
	float salarioLiquido() {
		return salarioBruto - (imposto/100*salarioBruto);
	}
	
	void aumentoSalario(float percentualAumento) {
		salarioBruto *= 1+(percentualAumento/100);
	}
}
