package oo.abstrato;

public abstract class Mamifero extends Animal {
	
	public abstract String mamar(); 
	
	
	// Não pode ser sobrescrito
//	@Override
//	public final String mover() {
//		// TODO Auto-generated method stub
//		return "Saindo do lugar";
//	}
	
	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return "Saindo do lugar";
	}
}
