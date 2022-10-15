package br.senac.rj.model;

public class Disciplina {
	private String nome;
	private double carga_horaria;

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
