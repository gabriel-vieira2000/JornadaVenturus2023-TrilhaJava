package aula14_TestesAutomatizados.Exercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio02.MaioridadeVoto;

class MaioridadeVotoTest {

	@Test
	void testeNaoPodeVotar() {
		MaioridadeVoto mv = new MaioridadeVoto();
		
		assertEquals("Nao pode votar", mv.maioridadeVoto(2013, 2023));
		assertEquals("Nao pode votar", mv.maioridadeVoto(2008, 2023));
	}
	
	@Test
	void testeVotoObrigatorio() {
		MaioridadeVoto mv = new MaioridadeVoto();
		
		assertEquals("Voto eh obrigatorio", mv.maioridadeVoto(2000, 2023));
		assertEquals("Voto eh obrigatorio", mv.maioridadeVoto(1980, 2023));
		assertEquals("Voto eh obrigatorio", mv.maioridadeVoto(1953, 2023));
	}
	
	@Test
	void testeVotoFacultativo() {
		MaioridadeVoto mv = new MaioridadeVoto();
		
		assertEquals("Voto eh facultativo", mv.maioridadeVoto(1952, 2023));
		assertEquals("Voto eh facultativo", mv.maioridadeVoto(2006, 2023));
		assertEquals("Voto eh facultativo", mv.maioridadeVoto(2007, 2023));
	}

}
