package aula14_TestesAutomatizados.Exercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercicio03.ConversorTemperatura;

class ConversorTemperaturaTest {

	@Test
	void testeConversaoCelsiusFahrenheit() {
		ConversorTemperatura ct = new ConversorTemperatura();
		
		assertEquals(32, ct.converteTemperaturaCelsiusFahrenheit(0));
		assertEquals(-4, ct.converteTemperaturaCelsiusFahrenheit(-20));
		assertEquals(77, ct.converteTemperaturaCelsiusFahrenheit(25));
	}
	
	@Test
	void testeConversaoFahrenheitCelsius() {
		ConversorTemperatura ct = new ConversorTemperatura();
		
		assertEquals(0, ct.converteTemperaturaFahrenheitCelsius(32));
		assertEquals(30, ct.converteTemperaturaFahrenheitCelsius(86));
		assertEquals(-14, ct.converteTemperaturaFahrenheitCelsius(6.8));
	}

}
