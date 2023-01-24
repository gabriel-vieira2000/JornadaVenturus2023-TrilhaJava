package aula10_Heranca.Exercicio01;

public class ContaJuridica extends Conta {
	private float limiteEmprestimo;
	
	public ContaJuridica(int numeroConta, String proprietario, float limiteEmprestimo) {
		super(numeroConta, proprietario);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(float valorEmprestimo) {
		if(valorEmprestimo > limiteEmprestimo) {
			System.out.println("Emprestimo Realizado! Taxa de Servico: R$10,00");
			this.sacar(valorEmprestimo+10.0f);
		}else {
			System.out.println("Emprestimo impossivel! Tente com um valor menor.");
		}
	}

	@Override
	public String toString() {
		return "ContaJuridica [numeroConta=" + this.getNumeroConta() + ", proprietario=" + this.getProprietario() + ", balanco=" + this.getBalanco() + "]";
	}
	
	
}
