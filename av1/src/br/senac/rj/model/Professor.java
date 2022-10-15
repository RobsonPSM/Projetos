package br.senac.rj.model;

public class Professor extends Pessoa {

	protected Disciplina disciplina;
	
	public Professor(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
		super(nome, cpf, matricula, telefone, email, endereco);
		// TODO Auto-generated constructor stub
	}

	public boolean lancarNotas(String matricula, String disciplina) {
		return false;
	}
	
	public boolean atualizarPresenca(String matricula, String disciplina) {
		return false;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		this.cpf = cpf;
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return this.matricula;
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
		return endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		this.endereco = endereco;
	}
	
}
