package br.senac.rj.model;

import java.util.List;

public class AlunoGraduacao extends Aluno {
	
	String projetoIntegrador;
	
	public AlunoGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco, String projetoIntegrador) {
		super(nome, cpf, matricula, telefone, email, endereco, projetoIntegrador);
		// TODO Auto-generated constructor stub
	}

	public String getProjetoIntegrador() {
		return projetoIntegrador;
	}

	public void setProjetoIntegrador(String projetoIntegrador) {
		this.projetoIntegrador = projetoIntegrador;
	}

	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return this.cpf;
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		this.cpf = cpf;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public void setMatricula(String matricula) {
		// TODO Auto-generated method stub
		this.matricula = matricula;
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		this.telefone = telefone;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return this.endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		this.endereco = endereco;
	}

	@Override
	public boolean atualizarAluno(Aluno alg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cadastrarAluno(Aluno alg) {
		return false;
	}

	@Override
	public boolean solicitarBoleto(Aluno alg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean solicitarHistorico(Aluno alg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean adicionarDisciplina(Aluno al) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Disciplina> getDisciplina() {
		// TODO Auto-generated method stub
		return disciplina;
	}

	@Override
	public void setDisciplina(List<Disciplina> disciplina) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Notas> getNotas() {
		// TODO Auto-generated method stub
		return notas;
	}

	@Override
	public void setNotas(List<Notas> notas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Frequencia> getFrequencia() {
		// TODO Auto-generated method stub
		return this.frequencia;
	}

	@Override
	public void setFrequencia(List<Frequencia> frequencia) {
		// TODO Auto-generated method stub
		
	}



}
