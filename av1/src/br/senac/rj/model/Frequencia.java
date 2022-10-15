package br.senac.rj.model;

public class Frequencia {
	private Disciplina disciplina;
	private Professor professor;
	private double frequencia;
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public double getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}
}
