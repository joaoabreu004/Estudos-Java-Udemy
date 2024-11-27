package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		
		
		try {

			Aluno aluno = new Aluno("    ", -4); 
			Validar.aluno(aluno);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroNegatioException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim;;;;");
		
		
		
		
	}
}
