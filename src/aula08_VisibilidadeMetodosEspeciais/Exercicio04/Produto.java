package aula08_VisibilidadeMetodosEspeciais.Exercicio04;

public class Produto {
	private int codigo;
	private String nomeProduto;
	private float preco;
	private int quantidade;
	
	public Produto(int codigo, String nomeProduto, float preco) {
		super();
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = 0;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
