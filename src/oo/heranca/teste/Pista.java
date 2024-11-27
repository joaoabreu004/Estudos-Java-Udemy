package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Etios;
import oo.heranca.desafio.Ferrari;

public class Pista {
	public static void main(String[] args) {
		
		Carro etios = new Etios(); 
		etios.acelerar();
		System.out.println(etios);
		
		System.out.println();
		Ferrari ferrari = new Ferrari(); 
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		System.out.println(ferrari);
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.desligarAr();
		ferrari.desligarTurbo();
		System.out.println(ferrari);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.ligarTurbo();
		System.out.println("Turbo Ligado");
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.ligarAr();
		System.out.println(ferrari.velocidadeDoAr());
		
	}

}
