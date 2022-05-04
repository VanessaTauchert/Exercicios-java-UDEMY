package com.aula;

public class Contador {
	
	int numPessoas;
	
	void mostrar() {
		if (numPessoas >=0)
		System.out.println("O numero de pessoas é: " + numPessoas);
		
		else {
			System.out.println("O numero nao pode ser -0 ");
			}

	}
	
	void zerar( ) {
		numPessoas = 0;
	}
	
	void incrementar() {
		if (numPessoas >0)
		numPessoas = numPessoas +1;
		
		
	}

	void decrementar() {
		if (numPessoas >0)
		numPessoas = numPessoas -1;
		
		else {
		System.out.println("O resultado nao pode ser -0 ");
		}
	}
}
