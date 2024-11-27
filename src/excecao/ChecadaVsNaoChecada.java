package excecao;

import javax.management.RuntimeErrorException;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim...");
	}

	
	//Exceção NÃO checada ou NÃO verificada
	static void geraErro1()  {
		throw new RuntimeException("Ocorreu um erro bem legal #01"); 
	}
	
	//Execeção checada ou verificada
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02"); 
	}
	
}
