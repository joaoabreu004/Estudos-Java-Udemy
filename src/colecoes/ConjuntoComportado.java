package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Dados homogêneos - Do mesmo tipo.
public class ConjuntoComportado {
	public static void main(String[] args) {
		
		// Aula de Criação - 132;
		//Set<String> listaAprovados = new HashSet<>();
		// Set que permite a ordenação; 
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Carlos"); 
		listaAprovados.add("Luca"); 
		listaAprovados.add("Pedro"); 
		listaAprovados.add("Ana"); 
		
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println("==========");
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1); 
		nums.add(2); 
		nums.add(120); 
		nums.add(6);  
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
	
	

}
