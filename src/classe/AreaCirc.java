package classe;

public class AreaCirc {
	
	double raio; 
	//Atributo Estático
	final static double pi = 3.14; 
	
	public AreaCirc(double raioInicial){ 
		this.raio = raioInicial; 
	}
	
	double area() {
		return pi * Math.pow(raio, 2); 
	}
	
	//Método Estático
	static double area(double raio) {
		return pi * Math.pow(raio, 2); 
	}

}
