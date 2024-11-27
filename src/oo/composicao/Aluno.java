package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	String nome; 
	final List<Curso> cursos = new ArrayList<>(); 
	
	public Aluno(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}
	
	void adicionarCursos(Curso curso) {
		this.cursos.add(curso); 
		curso.alunos.add(this); 
	}
	

	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso; 
			}
		}
		return null; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}

}
