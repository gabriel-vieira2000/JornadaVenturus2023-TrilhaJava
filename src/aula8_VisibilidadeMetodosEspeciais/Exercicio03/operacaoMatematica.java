package aula8_VisibilidadeMetodosEspeciais.Exercicio03;

public class operacaoMatematica {
	protected int n;
	
	public operacaoMatematica() {
		
	}

	public operacaoMatematica(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void parOuImpar() {
		if(this.n%2 == 0) {
			System.out.println("O numero "+this.n+" eh par");
		}else {
			System.out.println("O numero "+this.n+" eh impar");
		}
	}
	
	public void negativoOuPositivo() {
		if(this.n > 0) {
			System.out.println("O numero "+this.n+" eh positivo");
		}else {
			System.out.println("O numero "+this.n+" eh negativo");
		}
		
	}
}
