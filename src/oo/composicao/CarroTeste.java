package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		// O carro tem 1 motor. 
		// O motor tem 1 carro.
		Carro c1 = new Carro(); 
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());


		
		
	}

}
