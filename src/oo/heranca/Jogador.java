package oo.heranca;

public class Jogador {
	
	public int vida = 100; 
	public int x; 
	public int y;
 
//	public Jogador() {
//		this(0, 0);
//	}
//	
	public Jogador(int x, int y) {
		this.x = x; 
		this.y = y; 
		// TODO Auto-generated constructor stub
	}
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x); 
		int deltaY = Math.abs(y - oponente.y); 
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10; 
			return true; 
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10; 
			return true; 
		} else {
			return false;
		}
		
		
		
	}
	
	public boolean andar(Direcao direcao) { 
		switch(direcao) {
		case NORTE: 
			y--; 
			break; 
		case LESTE: 
			x++; 
			break; 
		case SUL: 
			y++;
			break; 
		case OESTE: 
			x--; 
			break; 
		}
		
		return true; 
	}

}
