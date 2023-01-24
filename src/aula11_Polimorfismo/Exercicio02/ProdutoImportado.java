package aula11_Polimorfismo.Exercicio02;

public class ProdutoImportado extends Produto {
	private float taxaAlfandega;

	public ProdutoImportado(String nome, float preco, float taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public float precoTotal() {
		return this.getPreco() + this.taxaAlfandega;
	}
	
	@Override
	public void etiquetaPreco() {
		System.out.println("--------ETIQUETA--------");
		System.out.println("NOME: "+this.getNome());
		System.out.printf("PRECO: R$%.2f %n",this.getPreco());
		System.out.printf("TAXA ALFANDEGA: R$%.2f %n", this.taxaAlfandega);
		System.out.printf("PRECO TOTAL: R$%.2f %n",this.precoTotal());
		System.out.println("------------------------");
	}

	public float getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(float taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	
}
