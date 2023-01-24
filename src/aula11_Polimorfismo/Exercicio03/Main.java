package aula11_Polimorfismo.Exercicio03;

public class Main {
	public static void main(String[] args) {
		Mamifero mam = new Mamifero(10, 5, 4, "Marrom");
		Lobo lobo = new Lobo(5, 12, 4, "Cinza");
		Cachorro cachorro = new Cachorro(12, 5, 4, "Branco e Preto");;
		
		mam.emitirSom();
		mam.alimentar();
		mam.locomover();
		
		lobo.emitirSom();
		lobo.alimentar();
		lobo.locomover();
		
		cachorro.abanarRabo();
		cachorro.enterrarOsso();
		cachorro.emitirSom();
		
		cachorro.reagir(true);
		cachorro.reagir(14);
		cachorro.reagir("Agradavel");
		cachorro.reagir(8, 12);
		cachorro.reagir(11, 5);
	}
	
}
