package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args) {
		Random sortear = new Random(); 
		int numeroSecreto = sortear.nextInt(101); 
		
		Scanner leitor = new Scanner(System.in); 
		
		int tentativas = 10; 
		int palpite; 
		
		System.out.println("Bem vindo ao jogo de adivinhação.");
		System.out.println("Tente adivinhar o número entre 0 a 100.");
		
		while(tentativas > 0) {
			System.out.print("Digite o seu palpite: ");
			palpite = leitor.nextInt(); 
			
			if(palpite == numeroSecreto) {
				System.out.println("Parabéns! Você acertou em " + (10 - tentativas + 1) + " tentativas." );
				break; 
			} else if (palpite < numeroSecreto) {
				 System.out.println("O número secreto é maior.");
			} else {
				System.out.println("O número secreto é menor.");
			}
			
			tentativas--;
            System.out.println("Tentativas restantes: " + tentativas);
		}
		
		if (tentativas == 0) {
            System.out.printf("Suas tentativas acabaram. O número secreto era: %d", numeroSecreto);
		} 
	}
}
