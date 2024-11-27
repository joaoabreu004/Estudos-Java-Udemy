package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/*
		 * TIPOS PRIMITIVOS
		 * 	- Byte 
		 * 	- Short 
		 * 	- Int 
		 * 	- Long 
		 *	- Float
		 *	- Double 
		 *	- Char  
		 *	- Boolean 
		 */
		
		// Informações do Funcionário
		
		// Tipos númericos inteiros	
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542; 
		int id = 56789; 
		long pontosAcumulados = 2_134_845_223l;
		
		// Tipos númericos reais;
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01; 
		
		
		// Tipo Booleano 
		boolean estaDeFerias = false; 
		
		//Tipo Caractere
		char status = 'A'; 
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Nmr. de viagens
		System.out.println(numeroDeVoos/2);
		
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
		
		
	}

}
