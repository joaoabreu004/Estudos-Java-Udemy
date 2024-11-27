package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(); 
		d1.dia = 21; 
		d1.mes = 10; 
		d1.ano = 2024; 
		
		Data d2 = new Data(28, 01, 2024 ); 
		
		String dataFormatada1 = d1.obterDataFormatada(); 
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
