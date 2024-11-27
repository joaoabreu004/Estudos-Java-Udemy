package fundamentos;

public class Temperatura { 
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32; 
		
		final double fahrenheit = 86; 
		final double celsius = (fahrenheit - AJUSTE) * FATOR; 
		
		System.out.println("O Resultado é: " + celsius + "ºC.");
	
		
		
		
	}
}
