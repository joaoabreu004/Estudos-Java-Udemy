package lambdas;

import java.util.function.BinaryOperator;

public interface CalculoTeste3 {
	public static void main(String[] args) {
		
		
		// NÃO PERMITE CONVERSÃO: int -> Double
	
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; }; 
		System.out.println(calculo.apply(2.0, 3.0));
		
	
		calculo = (x, y) -> x * y; 
		System.out.println(calculo.apply(5.0, 10.0));
		
		
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; }; 
		System.out.println(calculo2.apply(2, 3));
		
		
		calculo2 = (x, y) -> x * y; 
		System.out.println(calculo2.apply(5, 10));
		
	
		
	}
}
