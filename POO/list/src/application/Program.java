package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		
		
		System.out.println("----------- ADD -----------");
		list.add("Jos?");
		list.add("Alex");
		list.add("Marcos");
		list.add("Anna");
		list.add(2, "Thanatos");
		
		System.out.println(list.size());
		
		
		for(String names : list) {
			System.out.println(names);
		}
		
		
		
		System.out.println("----------- SEARCH -----------");
		System.out.println("Index of Anna: " + list.indexOf("Anna"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		
		
		
		System.out.println("----------- FILTER -----------");
		List<String> result = list.stream().filter(names -> names.charAt(0) == 'A').toList();
		for(String names : result) {
			System.out.println("Names: " +result);
		}
		
		
		
		System.out.println("----------- FINDFIRST -----------");
		String name = list.stream().filter(names -> names.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		System.out.println("----------- REMOVE -----------");

		list.remove("Anna");
		list.remove(1);
		list.removeIf(names -> names.charAt(0)== 'M');
		
		for(String names : list) {
			System.out.println(names);
		}
		
	}
}
