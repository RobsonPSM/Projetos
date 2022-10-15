package br.senac.rj.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Aluno extends Pessoa {
	
	protected List<Disciplina> disciplina = new ArrayList<Disciplina>();
	protected List<Notas> notas = new ArrayList<Notas>();
	protected List<Frequencia> frequencia = new ArrayList<Frequencia>();
	
	
	public Aluno(String nome, String cpf, String matricula, String telefone, String email, String endereco, String obrigacaoAluno) {
		super(nome, cpf, matricula, telefone, email, endereco);
	}
	

	public abstract boolean adicionarDisciplina(Aluno al);
	public abstract boolean atualizarAluno(Aluno al);
	public abstract boolean cadastrarAluno(Aluno al);
	public abstract boolean solicitarBoleto(Aluno al);
	public abstract boolean solicitarHistorico(Aluno al);
	
	public abstract List<Disciplina> getDisciplina();
	public abstract void setDisciplina(List<Disciplina> disciplina);
	public abstract List<Notas> getNotas();
	public abstract void setNotas(List<Notas> notas);
	public abstract List<Frequencia> getFrequencia();
	public abstract void setFrequencia(List<Frequencia> frequencia);
	public abstract String getNome();
	public abstract void setNome(String nome); 
	public abstract String getCpf(); 
	public abstract void setCpf(String cpf); 
	public abstract String getMatricula();
	public abstract void setMatricula(String matricula); 
	public abstract String getTelefone(); 
	public abstract void setTelefone(String telefone); 
	public abstract String getEmail();
	public abstract void setEmail(String email); 
	public abstract String getEndereco(); 
	public abstract void setEndereco(String endereco); 
	
	
}
