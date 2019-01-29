package secao_4_OO_exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		//Adicionar no meio da lista
		list.add(2, "Marco");
		
		
		// tamanho da lista
		System.out.println(list.size());
		
		
		for(String l : list) {
			System.out.println(l);
		}
		
	
		//remover
		//list.remove("Ana");
		//list.remove(1);		
		////list.removeIf(x -> x.charAt(0) != 'M');
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		
		System.out.println("-------------------------");
		
		for(String l : list) {
			System.out.println(l);
		}
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		for(String l : result) {
			System.out.println(l);
		}
	
		System.out.println("-------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}

}
