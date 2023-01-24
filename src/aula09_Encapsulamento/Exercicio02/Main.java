package aula09_Encapsulamento.Exercicio02;

public class Main {

	public static void main(String[] args) {
		Quadrado q = new Quadrado(10);
		Triangulo t = new Triangulo(10,20,3,4,5);

		q.getNomeFigura();
		q.getArea();
		q.getPerimetro();
		
		t.getNomeFigura();
		t.getArea();
		t.getPerimetro();
	}

}
