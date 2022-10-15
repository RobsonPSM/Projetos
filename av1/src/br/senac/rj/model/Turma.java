package br.senac.rj.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Curso curso;
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
