package aula09_Encapsulamento.Exercicio02;

public class Triangulo {
	private float base, altura;
	private float ladoA, ladoB, ladoC;
	
	public Triangulo(float base, float altura, float ladoA, float ladoB, float ladoC) {
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public void getNomeFigura() {
		System.out.println("NOME DA FIGURA: TRIANGULO");
	}
	
	public void getArea() {
		System.out.printf("AREA: %.1f %n",((this.getAltura()*this.getBase())/2));
	}
	
	public void getPerimetro() {
		System.out.printf("PERIMETRO: %.1f %n",this.getLadoA()*this.getLadoB()*this.getLadoC());
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLadoA() {
		return ladoA;
	}

	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}

	public float getLadoB() {
		return ladoB;
	}

	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}

	public float getLadoC() {
		return ladoC;
	}

	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}
	
	
}
