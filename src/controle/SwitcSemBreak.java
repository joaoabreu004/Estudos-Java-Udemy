package controle;

import java.util.Scanner;

public class SwitcSemBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Qual é a sua faixa?: ");
		String faixa = entrada.nextLine(); 
		
		switch(faixa.toLowerCase()) {
		case "preta": 
			System.out.println("Sei o Bassai-Dai...");
		case "marrom": 
			System.out.println("Sei o Tekki Shodan");
		case "roxa": 
			System.out.println("Sei o Heian Yodan");
		case "verde": 
			System.out.println("Sei o Heian Sandan");
		case "laranja": 
			System.out.println("Sei o Heian Nidan");
		case "amarela": 
			System.out.println("Sei o Heian Shodan");
			break; 
		default: 
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim");
	}
}
