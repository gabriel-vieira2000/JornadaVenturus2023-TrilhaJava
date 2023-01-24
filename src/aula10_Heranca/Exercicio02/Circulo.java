package aula10_Heranca.Exercicio02;

public class Circulo extends Forma {
	private float raio;
	private Cor cor;
	
	public Circulo(float raio, Cor cor) {
		super();
		this.raio = raio;
		this.cor = cor;
	}

	public float area() {
		return 3.14159f*(raio*raio);
	}
	
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", cor=" + cor + ", area="+ this.area() +"]";
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
