package aula07_ClassesEObjetos.Exercicio05;

public class Retangulo {
	float largura, altura;
	
	double area() {
		return largura*altura;
	}
	double perimetro() { 
		return largura*2 + altura*2;
	}
	double diagonal() {
		return Math.sqrt(largura*largura+altura*altura);
	}
}
