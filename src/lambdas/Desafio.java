package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p1 = new Produto("Ipad", 3235.89, 0.13); 
		
		Function<Produto, Double> precoFinal = 
			p -> p.preco * (1 - p.desconto); 
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100: preco + 50; 
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco)); 
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ","); 
		
		String preco = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(arredondar)
			.andThen(formatar)
			.apply(p1); 
		
		System.out.println("O preço final é: " + preco);
		
	
		
		
		
		
		
	}

}
