package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Quantas notas?: ");
		int qtdNotas = leitor.nextInt(); 
		
		double[] notas = new double[qtdNotas]; 
		
		for(int cont = 0; cont < notas.length; cont++) {
			System.out.print("Informe a nota " + (cont + 1 ) + "ª: "  );
			notas[cont] = leitor.nextDouble(); 
		}
		
		
		double total = 0; 
		for(double nota: notas) {
			total += nota; 
		}
		
		System.out.println(Arrays.toString(notas));
		System.out.println("A média é: " + total/notas.length);
		
		
		
		
		
		leitor.close();
	}

}
