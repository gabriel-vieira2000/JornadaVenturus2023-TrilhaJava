package aula07_ClassesEObjetos.Exercicio01;

public class Triangulo {
	float ladoA, ladoB, ladoC;
	double area() {
		double p = (ladoA+ladoB+ladoC)/2;
		return Math.sqrt(p * (p-ladoA) * (p-ladoB) * (p-ladoC));
	}
}
