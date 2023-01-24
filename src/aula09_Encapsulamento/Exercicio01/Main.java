package aula09_Encapsulamento.Exercicio01;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta(1, "Joao Silva", 100.00f);
		c1.estadoConta();
		c1.depositar(100f);
		c1.sacar(150f);
		
		Conta c2 = new Conta(2, "Maria Oliveira");
		c2.estadoConta();
		c2.depositar(100f);
		c2.sacar(200f);
		

	}

}
