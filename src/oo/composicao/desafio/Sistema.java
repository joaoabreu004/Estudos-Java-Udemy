package oo.composicao.desafio;



public class Sistema {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra(); 
		
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicioncarItem(new Produto("Notebook", 1897.88), 2);
	
		Compra compra2 = new Compra(); 
		compra2.adicionarItem("Camisas M - Branca", 15.50, 100);
		compra2.adicioncarItem(new Produto("Iphone XVI", 3609.00), 2);
		
		Cliente cliente1 = new Cliente("João Vitor Abreu"); 
		cliente1.compras.add(compra1); 
		cliente1.compras.add(compra2); 
		
		System.out.println(cliente1.obterValorTotal());

		
	}

}
