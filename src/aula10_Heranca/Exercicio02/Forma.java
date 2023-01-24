package aula10_Heranca.Exercicio02;

public abstract class Forma {
	private Cor cor;
	
	public abstract float area();

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
}
