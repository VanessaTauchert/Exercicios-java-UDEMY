package aula5;

public class Aluno {
	
	private String nome, ra;
	private Endereco endereco;
	
	public Aluno(String nome, String ra, Endereco endereco) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.endereco = endereco;
	}
	
	public void mDados() {
		System.out.println("Nome- " + nome);
		System.out.println("RA- " + ra);
		endereco.mDados();
	
	}
}
