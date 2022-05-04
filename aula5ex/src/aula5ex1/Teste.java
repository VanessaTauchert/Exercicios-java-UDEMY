package aula5ex1;

public class Teste {

	public static void main(String[] args) {

		Partido p1 = new Partido("Lumity", "Vencer" , Sigla.VT, 06);
		Partido p2 = new Partido("Kisara", "Batalhar" , Sigla.AS, 03);
		Partido p3 = new Partido("Kassandra", "Poder" , Sigla.MT, 21);
		Partido p4 = new Partido("Velvet", "Melhor" , Sigla.SS, 15);
		
		Candidato c1 = new Candidato("Vanessa", p1);
		
		c1.infC();
		
		c1.MudarP(p2);
		
		c1.infC();

	}

}
