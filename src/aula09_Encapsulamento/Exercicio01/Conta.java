package aula09_Encapsulamento.Exercicio01;

public class Conta implements ControleConta {
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
	
}
