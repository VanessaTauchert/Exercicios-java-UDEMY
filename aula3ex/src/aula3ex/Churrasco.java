package aula3ex;

public class Churrasco {
	double qtCarne;
	
	void verifConsumo(Pessoa pessoa) {
		if (pessoa.idade <=3 || pessoa.vegetariana == true) {
			qtCarne = 0;
			System.out.println(pessoa.nome + " nao consome Carne");
			
		} else if (pessoa.idade >=4 && pessoa.idade <=12) {
			qtCarne = 1;
			System.out.println(pessoa.nome + " consome "+ qtCarne + "kg de carne");
			
		}else {
			qtCarne = 2;
			System.out.println(pessoa.nome + " consome "+ qtCarne + "kg de carne");
		}
		
	}
	
}
