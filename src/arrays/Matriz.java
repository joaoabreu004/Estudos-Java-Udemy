package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		System.out.print("Quantos alunos?: ");
		int qtdAlunos = leitor.nextInt();
		System.out.print("Quantas notas por aluno?: ");
		int qtdNotas = leitor.nextInt(); 
		
		// Matriz
		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas]; 
		
		double total = 0; 
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				
				notasDaTurma[i][j] = leitor.nextDouble(); 
				total += notasDaTurma[i][j];
			}
		}
		
	
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é: " + media);
		leitor.close();
		
	}

}
