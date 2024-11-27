package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 8.6; 
		
		String  resultadoFinal = media >= 7.0 ? 
				"aprovado" : "reprovado";
		System.out.println("O aluno está: " + resultadoFinal);
		
		double nota = 9.9; 
		boolean bomComportamento = true; 
		boolean passouPorMedia = true; 
		boolean temDesconto = bomComportamento && passouPorMedia; 
		String resultado = temDesconto ? "Sim." : "Não"; 
		System.out.printf("Tem desconto? %s", resultado);
		
		
	}

}
