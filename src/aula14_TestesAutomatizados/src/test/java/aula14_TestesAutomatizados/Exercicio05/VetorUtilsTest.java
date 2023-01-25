package aula14_TestesAutomatizados.Exercicio05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio05.VetorUtils;

class VetorUtilsTest {

	@Test
	void testeMenorValorVetor() {
		int vetorTeste[] = {1,0,2,3,5,10};
		int vetorTeste2[] = {2,2,9,10,250};
		int vetorTeste3[] = {-10, -20, 20, 30};
		VetorUtils vu = new VetorUtils();
		
		assertEquals(0, vu.menorValorVetor(vetorTeste));
		assertEquals(2, vu.menorValorVetor(vetorTeste2));
		assertEquals(-20, vu.menorValorVetor(vetorTeste3));
	}
	
	@Test
	void testeMultiplicaVetorFator10() {
		int vetorTeste[] = {1, 0, 2, -3, 5, 10};
		int vetorEsperadoSaida[] = {10, 0, 20, -30, 50, 100};
		VetorUtils vu = new VetorUtils();
		
		assertArrayEquals(vetorEsperadoSaida, vu.multiplicaVetorFator10(vetorTeste));
	}

}
