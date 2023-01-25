package aula14_TestesAutomatizados.Exercicio04;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio04.Matematica;

class MatematicaTest {

	@Test
	void testeMultiplicacao() {
		Matematica mt = new Matematica();
		
		assertEquals(1000, mt.multiplicar(500, 2));
		assertEquals(-300, mt.multiplicar(-10, 30));
		assertThrows("Valor de X deve ser menor que 999", IllegalArgumentException.class,() -> mt.multiplicar(1000, 2));
	}
	
	@Test
	void testeDivisao() {
		Matematica mt = new Matematica();
		
		assertEquals(2, mt.dividir(20000, 10000));
		assertEquals(1, mt.dividir(4, 4));
		assertEquals(-2, mt.dividir(-4, 2));
		assertEquals(1.5, mt.dividir(3, 2));
		assertThrows("Valor do denominador y nao pode ser 0", IllegalArgumentException.class, () -> mt.dividir(1, 0));
	}

}
