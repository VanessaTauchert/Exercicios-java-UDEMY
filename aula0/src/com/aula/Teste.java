package com.aula;

public class Teste {

	public static void main(String[] args) {
		
		
		//Cachorro c = new Cachorro();
		//c.nome = "Bidu";
		//c.raca = "Shitsu";
		//c.latir();
		//c.mostrarRaca();
		
		//Cachorro c1 = new Cachorro();
		//c1.nome = "Vevet";
		//c1.raca = "Poodle";
		//c1.latir();
		
		//Contador n = new Contador();
		
		//n.numPessoas = 10;
		//n.mostrar();
		//n.incrementar();
		//n.mostrar();
		//n.decrementar();
		//n.mostrar();
		//n.zerar();
		//n.mostrar();
		
		Quadrado q1 = new Quadrado(5);
		
		q1.mostrar();
		
		//quando é return utiliza o println no teste
		System.out.println("O valor da Area é: " + q1.calArea());
		System.out.println("O valor do Perimetro é: " + q1.calPeri());
	}

}
