package aula10_Heranca.Exercicio02;

public class Retangulo {
	private float largura;
	private float altura;
	private Cor cor;
	
	public Retangulo(float largura, float altura, Cor cor) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.cor = cor;
	}

	public float area() {
		return largura*altura;
	}
	
	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + ", cor=" + cor + ", area="+ this.area() +"]";
	}
	
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
