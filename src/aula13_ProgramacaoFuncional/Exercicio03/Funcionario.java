package aula13_ProgramacaoFuncional.Exercicio03;

import java.util.Comparator;

public class Funcionario {
	private String nome, email;
	private float salario;
	
	public Funcionario(String nome, String email, float salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

}
