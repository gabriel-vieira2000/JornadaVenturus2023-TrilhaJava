package aula11_Polimorfismo.Exercicio03;

public abstract class Animal {
	private int peso;
	private int idade;
	private int membros;
	
	public Animal(int peso, int idade, int membros) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}

	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
}
