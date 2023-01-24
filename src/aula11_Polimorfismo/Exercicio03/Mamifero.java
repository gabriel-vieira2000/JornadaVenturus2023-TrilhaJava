package aula11_Polimorfismo.Exercicio03;

public class Mamifero extends Animal {
	private String corPelo;
	
	public Mamifero(int peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros);
		this.corPelo = corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamifero");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Alimentando");
	}
	
	@Override
	public void locomover() {
		System.out.println("Andando");
	}
}
