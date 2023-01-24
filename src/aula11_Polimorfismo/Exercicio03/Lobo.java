package aula11_Polimorfismo.Exercicio03;

public class Lobo extends Mamifero {
	
	public Lobo(int peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Auuuuuuuuuuuu...");
	}
}
