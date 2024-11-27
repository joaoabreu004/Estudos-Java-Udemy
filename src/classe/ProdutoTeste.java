package classe;

import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		//int a = 3; 
		//Scanner entrada = new Scanner(System.in); 
		
		Produto p1 = new Produto("Notebook", 4356.89); 
		//p1.nome = "Notebook"; 
		//p1.preco = 4356.89; 
		//p1.desconto = 0.25; 
		
		
		
		var p2 = new Produto("Caneca Preta", 12.56); 
		//p2.nome = "Caneca Preta"; 
		//p2.preco = 12.56; 
		//p2.desconto = 0.29; 
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		Produto.desconto = 0.50; 
		
		
		System.out.println(p1.nome + " " + p1.precoDesconto());
		System.out.println(p2.nome + " " + p2.precoDesconto());
		
		double precoFinal1 = p1.precoDesconto(); 
		double precoFinal2 = p2.precoDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2; 
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
		
	}
}
