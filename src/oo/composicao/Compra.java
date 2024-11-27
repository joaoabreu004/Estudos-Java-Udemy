package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	//O correto seria ter uma classe Cliente(); 
	String cliente; 
	ArrayList<Item> itens = new ArrayList<Item>(); 
	
	// Relação Bidimesional
	void adicionarItem(Item item) {
		itens.add(item); 
		item.compra = this; 
	}
	
	double obterValorTotal() {
		double total = 0 ; 
		
		for(Item item: itens) {
			total += item.quantidade * item.preco; 
		}
		
		return total; 
	}
	

}
