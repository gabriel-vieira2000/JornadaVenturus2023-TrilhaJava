package aula11_Polimorfismo.Exercicio03;

public class Cachorro extends Lobo {
	
	public Cachorro(int peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au Au Au Au...");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Agradavel")) {
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int horaDia) {
		if(horaDia > 7 && horaDia <= 12) {
			System.out.println("Abanar");
		}else if(horaDia < 19) {
			System.out.println("Abanar e Latir");
		}else {
			System.out.println("Ignorar");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			System.out.println("Abanar");
		}else {
			System.out.println("Rosnar e Latir");
		}
	}
	
	public void reagir(int idade, int peso) {
		if(idade < 5 && peso < 10) {
			System.out.println("Abanar");
		}else if(idade < 5 && peso > 10) {
			System.out.println("Latir");
		}else if(idade > 5 && peso < 10) {
			System.out.println("Rosnar");
		}else {
			System.out.println("Ignorar");
		}
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando o osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o Rabo");
	}
}
