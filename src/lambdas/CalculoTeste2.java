package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		//FUNÇÃO ANÔNIMA - EXPRESSÃO LAMBDA F.1
		Calculo calculo = (x, y) -> { return x + y; }; 
		
		System.out.println(calculo.executar(2, 3));
		
		//FUNÇÃO ANÔNIMA - EXPRESSÃO LAMBDA F.2
		calculo = (x, y) -> x * y; 
		System.out.println(calculo.executar(5, 10));
		
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
		
	}
}
