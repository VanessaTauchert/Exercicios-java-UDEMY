package aula3ex;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p1 =  new Pessoa("Vanessa","F", 4, false);
		Pessoa p2 =  new Pessoa("Kerstin","F", 3, true);
		Pessoa p3 =  new Pessoa("Velvet","F", 12, true);
		Pessoa p4 =  new Pessoa("Magi","M", 30, false);
		Pessoa p5 =  new Pessoa("Hunter","F", 7, false);
		
		Churrasco s = new Churrasco();
		s.verifConsumo(p1);
		s.verifConsumo(p2);
		s.verifConsumo(p3);
		s.verifConsumo(p4);
		s.verifConsumo(p5);
	}

}
