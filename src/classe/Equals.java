package classe;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(); 
		u1.nome = "João Abreu"; 
		u1.email = "jvabreusousa12@gmail.com";
		
		Usuario u2 = new Usuario(); 
		u2.nome = "João Abreu"; 
		u2.email = "jvabreusousa12@gmail.com"; 	
		
		System.out.println(u1.equals(u2));
		System.out.println(u1 == u2);
		System.out.println(u2 == u1);
		
		System.out.println(u2.equals(new Date()));
	}
	
	


}
