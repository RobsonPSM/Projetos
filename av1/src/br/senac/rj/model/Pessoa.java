package br.senac.rj.model;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected String matricula;
	protected String telefone;
	protected String email;
	protected String endereco;
	
	public Pessoa(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
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
