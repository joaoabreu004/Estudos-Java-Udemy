package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari() {
		// TODO Auto-generated constructor stub
		this(550); 
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima); 
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = true;
		setDelta(35);
	}
	
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = false; 
		setDelta(15); 
	}
	
	
	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;
		
	}
	
	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false; 
	}
	
	@Override
	public int getDelta() {
		// TODO Auto-generated method stub
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30; 
		}else if(!ligarTurbo && !ligarAr) {
			return 20; 
		}else {
			return 15;
		}
		
	}
	
//	@Override
//	publc void acelerar() {
//		velocidadeAtual += 15; 
//	}

}
