package aula8_VisibilidadeMetodosEspeciais.Exercicio01;

public class ContaBanco {
	public String numConta;
	protected String tipoConta;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco(String numConta, String tipoConta, String dono ) {
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.dono = dono;
		this.status = false;
		this.saldo = 0f;
	}
	
	public void abrirConta() {
		this.status = true;
		if(this.tipoConta.equals("CC")) {
			this.saldo += 50f;
		}else {
			this.saldo += 150f;
		}
		System.out.println("Conta "+tipoConta+" Aberta!");
	}
	
	public void fecharConta() {
		if(this.saldo == 0) {
			this.status = false;
			System.out.println("Conta fechada com sucesso!");
		}else if(this.saldo > 0) {
			System.out.println("Impossivel fechar a conta! Ainda ha saldo a ser sacado!");
		}else {
			System.out.println("Impossivel fechar a conta! Ainda ha dividas a serem pagas");
		}
	}
	
	public void depositar(float valor) {
		if(this.status) {
			this.saldo += valor;
			System.out.println("Deposito efetuado com sucesso!");
		}else {
			System.out.println("A conta nao esta aberta! Deposito cancelado");
		}
	}
	
	public void sacar(float valor) {
		if(this.status) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("A conta nao esta aberta! Saque cancelado");
		}
	}
	
	public void pagarMensal() {
		if(this.tipoConta.equals("CC")) {
			this.saldo -= 12f;
		}else {
			this.saldo -= 20f;
		}
		System.out.println("Taxa Mensal Paga!");
	}
	
	private String getNumConta() {
		return this.numConta;
	}
	
	private float getSaldo() {
		return this.saldo;
	}
	
	public void consultaSaldo() {
		System.out.printf("O saldo da conta %s eh R$%.2f%n",this.getNumConta(),this.getSaldo());
	}
}
