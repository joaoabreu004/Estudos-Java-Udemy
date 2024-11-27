package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro(2, 2); 
		
		Heroi j2 = new Heroi(10, 11); 
		
		
		System.out.println("Monstro tem => " + j1.vida);
		System.out.println("Herói tem => " + j2.vida);

		j1.atacar(j2);
		j1.atacar(j2);
		j2.atacar(j1); 
		j2.atacar(j1); 
		System.out.println("Monstro tem => " + j1.vida);
		System.out.println("Herói tem => " + j2.vida);
		

	}
}
