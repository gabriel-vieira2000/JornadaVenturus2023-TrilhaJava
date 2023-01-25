package Exercicio03;

public class ConversorTemperatura {
	
	public double converteTemperaturaCelsiusFahrenheit(double temperaturaCelsius) {
		return (temperaturaCelsius * 9/5) + 32 ;
	}
	
	public double converteTemperaturaFahrenheitCelsius(double temperaturaFahrenheit) {
		return (temperaturaFahrenheit - 32)/1.8;
	}
}
