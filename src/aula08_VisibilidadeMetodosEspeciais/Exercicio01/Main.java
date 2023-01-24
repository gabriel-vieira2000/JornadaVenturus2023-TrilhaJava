package aula08_VisibilidadeMetodosEspeciais.Exercicio01;

public class Main {

	public static void main(String[] args) {
		ContaBanco contaJoao = new ContaBanco("0001","CC","Joao da Silva");
		ContaBanco contaMaria = new ContaBanco("0002","CP","Maria Silva");
		
		contaJoao.abrirConta();
		contaJoao.depositar(300f);
		contaJoao.consultaSaldo();
		
		contaMaria.abrirConta();
		contaMaria.depositar(400f);
		contaMaria.consultaSaldo();
		
	}

}
