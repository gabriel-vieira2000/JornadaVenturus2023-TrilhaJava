package aula10_Heranca.Exercicio01;

public class Conta {
	private int numeroConta;
	private String proprietario;
	private float balanco;
	
	public Conta(int numeroConta, String proprietario) {
		this.numeroConta = numeroConta;
		this.proprietario = proprietario;
		this.balanco = 0;
	}
	
	public Conta(int numeroConta, String proprietario, float balanco) {
		this.numeroConta = numeroConta;
		this.proprietario = proprietario;
		this.balanco = balanco;
	}
	
	public void depositar(float valor) {
		this.balanco += valor;
		this.estadoConta();
	}
	public void sacar(float valor) {
		this.balanco -= (valor + 5.00f); // R$ 5,00 = taxa de serviço
		this.estadoConta();
	}
	
	public void estadoConta() {
		System.out.println("Conta n: "+this.getNumeroConta());
		System.out.println("Proprietario: "+this.getProprietario());
		System.out.printf("Saldo: R$%.2f%n",this.getBalanco());
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public String getProprietario() {
		return this.proprietario;
	}
	
	public float getBalanco() {
		return this.balanco;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", proprietario=" + proprietario + ", balanco=" + balanco + "]";
	}
	
}
