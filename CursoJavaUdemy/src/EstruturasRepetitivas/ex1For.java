package EstruturasRepetitivas;

import java.util.Scanner;

public class ex1For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1-Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o 
		//X, se for o caso.
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++ ) {
			if(i%2 !=0) {
				System.out.println("valor: " + i);
			}
			
			
		}
		
		sc.close();
	}

}
