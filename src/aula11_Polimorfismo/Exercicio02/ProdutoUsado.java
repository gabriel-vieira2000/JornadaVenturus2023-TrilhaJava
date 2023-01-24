package aula11_Polimorfismo.Exercicio02;

public class ProdutoUsado extends Produto {
	private String dataFabricacao;
	
	public ProdutoUsado(String nome, float preco, String dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public void etiquetaPreco() {
		System.out.println("--------ETIQUETA--------");
		System.out.println("NOME: "+this.getNome());
		System.out.printf("PRECO: R$%.2f %n",this.getPreco());
		System.out.println("DATA DE FABRICACAO: " + this.dataFabricacao);
		System.out.println("------------------------");
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
}
