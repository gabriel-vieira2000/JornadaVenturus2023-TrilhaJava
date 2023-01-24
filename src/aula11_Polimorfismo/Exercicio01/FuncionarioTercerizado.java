package aula11_Polimorfismo.Exercicio01;

public class FuncionarioTercerizado extends Funcionario {
	
	public FuncionarioTercerizado(String nome, int horas, float valorPorHora) {
		super(nome, horas, valorPorHora);
	}

	@Override
	public void pagamento() {
		System.out.printf("O pagamento desse funcionario Tercerizado deve ser: R$%.2f %n",this.getHoras()*this.getValorPorHora());
	}
	
}
