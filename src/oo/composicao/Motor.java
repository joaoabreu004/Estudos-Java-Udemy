package oo.composicao;

public class Motor {
	
	
	
	//Relação Bidimensional 1 para 1; 
	final Carro carro; 
	boolean ligado = false; 
	double fatorInjecao = 1;
	
	//Relação Bidimensional
	public Motor(Carro carro){
		this.carro = carro; 
	}
	
	int giros() {
		if(!ligado) {
			return 0; 
		}else {
			return (int) Math.round(fatorInjecao * 3000);	
		}
	}
}
