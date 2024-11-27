package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegatioException extends RuntimeException{
	
	public String nomeDoAtributo; 
	
	public NumeroNegatioException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo; 
	}
	
	
	public String getMessage() {
		return String.format("O atributo %s está negativo", nomeDoAtributo); 
	}
	
}