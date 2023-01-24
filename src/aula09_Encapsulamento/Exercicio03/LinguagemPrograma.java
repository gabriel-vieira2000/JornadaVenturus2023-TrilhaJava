package aula09_Encapsulamento.Exercicio03;

public class LinguagemPrograma implements Linguagem {
	private String nome;
	private String linguagem;
	private int experiencia;
	
	public LinguagemPrograma(String nome, String linguagem, int experiencia) {
		this.nome = nome;
		this.linguagem = linguagem;
		this.experiencia = experiencia;
	}

	public void pessoa() {
		System.out.println("Ola eu me chamo "+this.nome);
	}
	
	public void linguagemProgramacao() {
		System.out.println("Trabalho com a linguagem de programacao "+this.linguagem);
	}
	
	public void experiencia() {
		System.out.println("Tenho "+experiencia+" anos de experiencia com ela");
	}
}
