package aula13_ProgramacaoFuncional.Exercicio02;

import java.util.Comparator;

public class ComparacaoNomesProdutos implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return p2.getNome().toUpperCase().compareTo(p1.getNome().toUpperCase());
	}

}
