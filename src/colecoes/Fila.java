package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>(); 
		
//		.add() - lançará uma exceção caso a fila esteja cheia.
//
//       .offer() - retorna falso caso a fila esteja cheia.
		
		fila.add("Ana");
		fila.offer("Bia");
		
		fila.add("Carlos");
		fila.offer("Daniel");
		
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		

		//fila.clear();
		//fila.isEmpty(); 
		//fila.contains(...)
		//fila.size();
		
	}
}
