package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana"); 
		
		// Utilizando o FOR
		for(int i = 0;  i < aprovados.size(); i++) {
			 System.out.println(aprovados.get(i));
		}; 
		
		System.out.println("=====");
		//For each 
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		
		//Usando o Iterator
		System.out.println("=====");
		Iterator<String> it = aprovados.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Usando o Stream 
		System.out.println("=====");
		Stream<String> st = aprovados.stream(); 
		st.forEach(System.out::println); //Laço Interno.
		
		
		
	}
}
