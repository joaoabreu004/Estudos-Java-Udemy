package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // Implícita
		System.out.println(a);
		
		
		float b = (float) 1.12345678888; // Explícita (Cast)
		System.out.println(b);
		
		int c = 340; 
		byte d = (byte) c; 
		System.out.println(c);
		
		double e = 1; 
		int f = (int)e; 
		System.out.println(f);
		
		
		
		
		
		
		
		
	}
}
