package aula11_Polimorfismo.Exercicio02;

public class Produto {
	private String nome;
	private float preco;
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void etiquetaPreco() {
		System.out.println("--------ETIQUETA--------");
		System.out.println("NOME: "+this.nome);
		System.out.printf("PRECO: %.2f %n",this.preco);
		System.out.println("------------------------");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
