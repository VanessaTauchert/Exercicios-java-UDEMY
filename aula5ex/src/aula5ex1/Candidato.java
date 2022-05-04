package aula5ex1;

public class Candidato {
	
	private String cnome;
	private Partido partido;
	private boolean brasileiro;

	public Candidato(String cnome, Partido partido) {
		
		this.cnome = cnome;
		this.partido = partido;
		
	}



	public void infC() {
		System.out.println("Nome Cadidato- " + cnome);
		partido.infP();
	}
	
	public void MudarP(Partido partido) {
		System.out.println("Mudanca de Partido ");
		this.partido = partido;
	}
	

}
