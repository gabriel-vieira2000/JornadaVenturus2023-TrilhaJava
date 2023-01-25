package aula14_TestesAutomatizados.Exercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio01.Calculadora;

class CalculadoraTest {

	@Test
	void testSomaCalculadora() {
		Calculadora calc = new Calculadora();
		
		assertEquals(12, calc.soma(8, 4));
		assertEquals(-4.2, calc.soma(-1.2, -3));
		assertEquals(0, calc.soma(10, -10.0));
		assertEquals(0, calc.soma(0, 0));
	}
	
	@Test
	void testSubtracaoCalculadora() {
		Calculadora calc = new Calculadora();
		
		assertEquals(2, calc.subtracao(6, 4));
		assertEquals(0, calc.subtracao(-10, -10));
		assertEquals(10, calc.subtracao(20, 10));
		assertEquals(-4, calc.subtracao(12, 16));
	}
	
	@Test
	void testMultiplicacaoCalculadora() {
		Calculadora calc = new Calculadora();
		
		assertEquals(200, calc.multiplicacao(10, 20));
		assertEquals(1, calc.multiplicacao(1,1));
		assertEquals(-200, calc.multiplicacao(-20, 10));
		assertEquals(0, calc.multiplicacao(0,0));
	}
	
	@Test
	void testDivisaoCalculadora() {
		Calculadora calc = new Calculadora();
		
		assertEquals(2, calc.divisao(20,10));
		assertEquals(1, calc.divisao(30,30));
		assertEquals(0, calc.divisao(0,1));
		assertEquals(-10, calc.divisao(-20,2));
	}

}
