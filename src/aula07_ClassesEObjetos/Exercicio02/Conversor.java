package aula07_ClassesEObjetos.Exercicio02;

public class Conversor {
	float cotacaoDolar;
	float valorEmDolares, valorEmReais, iof;
	
	void calculaValorAPagarEmReais() {
		valorEmReais = valorEmDolares * cotacaoDolar;
	}
	
	void calculaIOFAPagar() {
		iof = 0.06f*valorEmDolares;
	}
	
	float totalAPagar() {
		return valorEmReais+iof;
	}
}
