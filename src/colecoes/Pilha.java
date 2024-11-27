package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		//Pilha; 
		Deque<String> livros = new ArrayDeque<String>(); 
		
		livros.add("O pequeno príncipe"); 
		livros.push("Don Quixote"); 
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		System.out.println(livros.pop());
		
		livros.size(); 
		livros.clear();
		livros.contains("...");
		livros.isEmpty();
		
	}
}
