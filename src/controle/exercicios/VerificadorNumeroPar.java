package controle.exercicios;

import java.util.Scanner;

public class VerificadorNumeroPar {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		
		System.out.print("Digite um número: ");
		int num = leitor.nextInt(); 
		
		if(num >= 0 && num <= 10 && num % 2 == 0) {
			System.out.printf("O número %d é par e está entre 0 e 10.", num);
		} else {
			System.out.printf("O número %d não atende aos critério.", num);
		}
		
		
	}

}
