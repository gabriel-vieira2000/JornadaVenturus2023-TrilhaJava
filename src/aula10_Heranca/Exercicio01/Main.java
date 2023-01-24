package aula10_Heranca.Exercicio01;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta(1,"Joao");
		ContaJuridica cj = new ContaJuridica(2, "Empresa do Joao", 10000f);
		
		c1.depositar(200f);
		c1.sacar(100f);
		c1.toString();
		System.out.println(c1.toString());
		
		cj.depositar(5000f);
		cj.emprestimo(12000f);
		cj.emprestimo(10000f);
		System.out.println(cj.toString());

	}

}
