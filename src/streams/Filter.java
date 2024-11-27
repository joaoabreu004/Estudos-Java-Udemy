package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 9.8);
		Aluno a2 = new Aluno("Bia", 7.8);
		Aluno a3 = new Aluno("Daniel", 2.8);
		Aluno a4 = new Aluno("Gui", 4.8);
		Aluno a5 = new Aluno("Rebeca", 6.8);
		Aluno a6 = new Aluno("Pedro", 4.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5,a6); 
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7; 
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabéns " + a.nome + ", você foi aprovado(a)!"; 
				
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado) 
			.forEach(System.out::println);
		
		
	}
}
