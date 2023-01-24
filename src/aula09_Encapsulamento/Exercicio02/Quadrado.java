package aula09_Encapsulamento.Exercicio02;

public class Quadrado implements ControleFormaGeometrica {
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	public void getNomeFigura() {
		System.out.println("FIGURA: QUADRADO");
	}
	
	public void getArea() {
		System.out.printf("AREA: %.1f %n",(this.getLado()*this.getLado()));
	}
	
	public void getPerimetro() {
		System.out.printf("PERIMETRO: %.1f %n",(this.getLado()*4));
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
}
