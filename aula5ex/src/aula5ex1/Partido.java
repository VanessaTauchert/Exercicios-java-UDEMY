package aula5ex1;

public class Partido {
	private String nome, ideologia;
	private Sigla sigla;
	private int numero;
	
	
	public Partido(String nome, String ideologia, Sigla sigla, int numero) {
		super();
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numero = numero;
	}
	
	public void infP() {
		System.out.println("Nome Partido- " + nome);
		System.out.println("Ideologia- " + ideologia);
		System.out.println("Sigla- " + sigla);
		System.out.println("Numero- " + numero);
	}

	
	
	
	
}
