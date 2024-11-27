package classe;

public class Data {
	
	int dia; 
	int mes; 
	int ano; 
	
	Data(){
		//This() - Método/Apenas em Construtores. 
		this(1, 1, 1971); 
	}
	
	public Data(int dia, int mes, int ano) {
		//"This" - referência o uso da instancia; 
	        this.dia = dia;
	        this.mes = mes;
	        this.ano = ano; 
	}

	String obterDataFormatada() {
		//Variáveis Locais
		final String formato = "%d/%d/%d"; 
		return String.format(formato, dia, mes, ano); 
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	

	

}
