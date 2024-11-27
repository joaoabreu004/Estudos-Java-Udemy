package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhou2 = true; 
		boolean trabalhou1 = true; 
		
		
		boolean comprouTv50 = trabalhou1 && trabalhou2; 
		boolean comprouTv30 = trabalhou1 ^ trabalhou2; 
		boolean comprouSorvete = trabalhou1 || trabalhou2;
		// Operador Unário! 
		boolean maisSaudavel = !comprouSorvete; 
		
		
		
		System.out.println("Comprou TV 50\"?" + comprouTv50);
		System.out.println("Comprou TV 30\"?" + comprouTv30);
		System.out.println("Comprou Sorvete\"?" + comprouSorvete);
		System.out.println("Mais saudável\"?" + maisSaudavel);
	}

}
