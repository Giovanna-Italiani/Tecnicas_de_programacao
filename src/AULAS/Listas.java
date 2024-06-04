package AULAS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Giovanna");
		lista.add("Moisés");
		lista.add("Henrique");
		lista.add("Everton");
		lista.add(0, "Daiane");
		
		System.out.println("Itens da lista:" + lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------Removendo nomes com H------");
		lista.removeIf(x -> x.charAt(0) == 'H');
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------Consulta------");
		System.out.println("Buscar por Everton: " + lista.indexOf("Everton"));
		System.out.println("Busccar por Giovanna: " + lista.indexOf("Giovanna"));
		
		System.out.println("------Consulta pela letra M------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
