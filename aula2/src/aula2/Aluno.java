package aula2;

public class Aluno {
	String nome;
	Curso curso;
	int idade;
	
	Aluno(String nome, Curso curso , int idade){
		this.nome = nome;
		this.curso = curso;
		this.idade = idade;
	}
	
	void tratnome() {
		String curso = "";
		switch (this.curso) {
			case SISTEMAS_PARA_INTERNET:
				curso = "SISTEMAS PARA INTERNET";
				break;
				default:
							
		}
		System.out.println("Curso: " + curso);
	}
	void mostrar() {
		
		System.out.println("Nome: " + nome);
		
		tratnome();
		System.out.println("Idade: " + idade);
	}
	
	
	
}
