package controle.exercicios;

import java.time.Year;

public class AnoBissexto {
	public static void main(String[] args) {
		int anoAtual = Year.now().getValue(); 
		
		if(anoAtual % 4 == 0 && (anoAtual % 100 != 0 || anoAtual % 400==0)) {
			System.out.printf("%d é um ano bissexto.", anoAtual);
		} else {
			System.out.printf("%d não é um ano bissexto.", anoAtual);
		}
	}

}
