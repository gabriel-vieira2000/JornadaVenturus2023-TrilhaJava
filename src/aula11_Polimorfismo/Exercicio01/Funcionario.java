package aula11_Polimorfismo.Exercicio01;

public class Funcionario {
	private String nome;
	private int horas;
	private float valorPorHora;
	
	public void pagamento() {
		System.out.printf("O Pagamento desse Funcionario deve ser: R$%.2f %n",horas*valorPorHora);
	}
	
	public Funcionario(String nome, int horas, float valorPorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public float getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(float valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	
}
