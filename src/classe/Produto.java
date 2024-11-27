package classe;

public class Produto {
	
	// Atributos 
	String nome; 
	double preco; 
	static double desconto = 0.25;
	
	
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

	// Métodos
	double precoDesconto() {
		return preco * (1 - desconto); 
	}
	
	double precoComDescontoGerente(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente)) ; 
	}
}
