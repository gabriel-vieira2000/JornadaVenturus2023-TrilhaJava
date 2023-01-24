package aula08_VisibilidadeMetodosEspeciais.Exercicio02;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro("Preto","Volkswagen",2010,120);
		Carro c2 = new Carro("Vermelho", "FIAT",2014,140);
		
		c1.acelerar();
		c1.ligar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c2.ligar();
		c2.acelerar();
		c2.desligar();
		c2.acelerar();
	}

}
