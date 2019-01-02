package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Paulo");
		list.add("Ricardo");
		list.add("Evonira");
		list.add("Eduardo");
		list.add("Brenno");
		list.add("Yesllin");
		list.add("Anna");
		list.add("Maria");
		list.add("Lucas");
		list.add("Henrique");
		list.add("Pedro");

		System.out.println();
		System.out.println("Numero da Lista: " + list.size());
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("-- Nomes Contidos na Lista:  --");
		System.out.println("----------------------------------");
		System.out.println();
		for (String nomes : list) {
			System.out.println(nomes);

		}

		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("-- Nomes Contidos na Lista:  --");
		System.out.println("----------------------------------");
		System.out.println();

		list.removeIf(nome -> nome.charAt(0) == 'P');
		System.out.println();
		System.out.println("Numero da Lista: " + list.size());
		System.out.println();
		for (String nomes : list) {
			System.out.println(nomes);

		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("-- Posição dos Nomes Contidos na Lista:  --");
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Index  of Evonira: " + list.indexOf("Evonira"));
		System.out.println("Index  of Anna: " + list.indexOf("Anna"));
		System.out.println();
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'a').collect(Collectors.toList());
		for (String nomes : result) {
			System.out.println(nomes);
			
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("    -- Filtrando por Caracteres Contidos na Lista:  --"     );
		System.out.println("-- Filtro pela letra J Caso não possua retornará (null)  --");
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		String nome = list.stream().filter(nomes -> nomes.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(nome);	

	}
}
