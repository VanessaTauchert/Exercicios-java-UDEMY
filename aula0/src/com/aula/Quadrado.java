package com.aula;

public class Quadrado {
	double lado;
	
	Quadrado (double lado){
		this.lado  = lado;
	}
	
	double calPeri() {
		return 4*lado;
	}
	
	double calArea() {
		return Math.pow(lado, 2);
		
	}
	
	void mostrar() {
		System.out.println("O valor do Lado é: " + lado);
	}
	
	
}
