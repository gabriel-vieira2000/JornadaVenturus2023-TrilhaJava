package aula13_ProgramacaoFuncional.Exercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List <Integer> numeros = Arrays.asList(3,4,5,10,7,14,16);
		
		List<Integer> numerosMultiplicados = numeros.stream().map(num -> num*10).collect(Collectors.toList());
		numerosMultiplicados.forEach(System.out::println);
		System.out.println("------");
		
		List <Integer> numeros2 = Arrays.asList(3,4,5,10,7,14,16);
		
		Function<Integer, Integer> multiplicaNumerosPor20 = num -> num * 20;
		Predicate<Integer> filtroNumerosPares = num -> num%2 == 0;
		
		List<Integer> numeros2Processados = numeros2.stream()
											.filter(filtroNumerosPares)
											.map(multiplicaNumerosPor20)
											.collect(Collectors.toList());
		numeros2Processados.forEach(System.out::println);
		
	}

}
