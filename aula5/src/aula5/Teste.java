package aula5;

public class Teste {

	public static void main(String[] args) {
		
		Endereco e1 = new Endereco("1231-99", "R teste", "Sao Vicente", Estado.SP);
		
		
		Aluno a1 = new Aluno("Vanessa", "5489642", e1);
		a1.mDados();
	}

}
