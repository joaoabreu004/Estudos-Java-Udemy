package classe;

public class PrimeiroTrauma {
	
	int a = 3; // Não pode mexer aqui!
	static int b = 4; 
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); 
		//pode mexer aqui
		System.out.println(p.a);
		
		System.out.println(b);
		
	}

}
