package br.senac.rj.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private double carga_horaria;
	private String tipo_curso;
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	public double getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getTipo_curso() {
		return tipo_curso;
	}
	public void setTipo_curso(String tipo_curso) {
		this.tipo_curso = tipo_curso;
	}
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
}
