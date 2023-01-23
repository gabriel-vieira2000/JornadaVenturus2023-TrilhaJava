package aula8_VisibilidadeMetodosEspeciais.Exercicio02;

public class Carro {
	public String cor, marca;
	public int ano;
	public int marcha, velocidadeAtual, velocidadeMaxima;
	public boolean ligado;
	
	public Carro(String cor, String marca, int ano, int velocidadeMaxima) {
		super();
		this.cor = cor;
		this.marca = marca;
		this.ano = ano;
		this.velocidadeMaxima = velocidadeMaxima;
		this.ligado = false;
		this.marcha = 0;
		this.velocidadeAtual = 0;
	}
	
	public void ligar() {
		this.ligado = true;
		System.out.println("Carro esta ligado");
	}
	
	public void desligar() {
		this.ligado = false;
		System.out.println("Carro esta desligado");
	}
	
	public void acelerar() {
		if(this.ligado) {
			if(this.velocidadeAtual+10 > this.velocidadeMaxima) {
				System.out.println("Velocidade maxima atingida! Pare de acelerar");
			}else {
				this.velocidadeAtual += 10;
				System.out.println("Velocidade Atual: "+this.velocidadeAtual+"km/h");
				this.pegarMarcha();
			}
		}else {
			System.out.println("Carro esta desligado! Nao pode acelerar");
		}
	}
	
	public void pegarMarcha() {
		if(this.velocidadeAtual < 0) {
			System.out.println("Marcha Re");
			this.marcha = -1;
		}else if(this.velocidadeAtual == 0) {
			System.out.println("Ponto Morto");
			this.marcha = 0;
		}else if(this.velocidadeAtual > 0 && this.velocidadeAtual < 40) {
			System.out.println("Marcha Media");
			this.marcha = 1;
		}else if(this.velocidadeAtual >= 40 && this.velocidadeAtual <= 80) {
			System.out.println("Marcha Alta");
			this.marcha = 2;
		}else {
			System.out.println("Marcha Maxima");
			this.marcha = 3;
		}
	}
	
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
}
