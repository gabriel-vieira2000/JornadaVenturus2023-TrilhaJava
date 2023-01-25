package Exercicio02;

public class MaioridadeVoto {
	
	public String maioridadeVoto(int anoNascimento, int anoAtual) {
		int idade = anoAtual - anoNascimento;
		
		if(idade < 16) {
			return "Nao pode votar";
		}else if(idade >= 18 && idade <= 70) {
			return "Voto eh obrigatorio";
		}else {
			return "Voto eh facultativo";
		}
	}
}
