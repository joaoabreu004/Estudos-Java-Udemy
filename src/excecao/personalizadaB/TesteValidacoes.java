package excecao.personalizadaB;

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
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumeroNegatioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim;;;;");
		
		
		
		
	}
}
