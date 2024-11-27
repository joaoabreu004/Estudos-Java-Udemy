package oo.heranca.desafio;

public class Carro {
	
	
	public final int VELOCIDADE_MAXIMA; 
	protected int velocidadeAtual; 
	private int delta = 5; 
	
	

	protected Carro(int velocidadeMaxima) {
		// TODO Auto-generated constructor stub
		VELOCIDADE_MAXIMA = velocidadeMaxima; 
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	public void acelerar() {
		 if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			 velocidadeAtual = VELOCIDADE_MAXIMA; 
		 }else {
			 velocidadeAtual += getDelta(); 
 
		 }
	 
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0; 
		}
		 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Velocidade atual é " + velocidadeAtual + "Km/h"; 
	}
}
