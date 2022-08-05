package br.com.alura;

public class Aluno {

	private String nome;
	private int cpf;

	public Aluno(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aluno: "+this.nome + " Matrícula: " + this.cpf+" ]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Aluno outro=(Aluno) obj;
		return  this.nome.equals(outro.getNome());
		
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
