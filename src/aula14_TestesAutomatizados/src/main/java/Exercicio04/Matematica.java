package Exercicio04;

public class Matematica {
	
	public long multiplicar(int x, int y) {
		if(x > 999) throw new IllegalArgumentException("Valor de X deve ser menor que 999");
		return x*y;
	}
	
	public double dividir(int x, int y) {
		if(y == 0) throw new IllegalArgumentException("Valor do denominador y nao pode ser 0");
		return (double) x/y;
	}
	
}
