package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		// System.out.println(Locale.getDefault());
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Informe o 1º Salário: ");
		String valor1 = entrada.next().replace(",", "."); 
		System.out.print("Informe o 2º Salário: ");
		String valor2 = entrada.next().replace(",", ".");
		System.out.print("Informe o 3º Salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3; 
		System.out.println("A média dos salários é : R$" + media);
		
		entrada.close();
		
		
	}
}
