package aula1_IntroducaoEInstalacao;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Desafio2 {

	public static void main(String[] args) {
		Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println("A largura da sua tela eh: "+tamanhoTela.width+"px");
		System.out.println("A altura da sua tela eh: "+tamanhoTela.height+"px");

	}

}
