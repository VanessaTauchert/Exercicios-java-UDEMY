package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char pergunta;
			
		do {
				
			System.out.printf("Digite a temperatura em Celsius: ");
				
			double c = sc.nextDouble();
			double f = (9*c/5)+32;
								
			
			System.out.println("Equivalente em Fahrenheight: " + f);
			
			System.out.printf("Deseja repetir (s/n)? ");
			
			pergunta = sc.next().charAt(0);
			
			
			
			
			}while(pergunta != 'n');
			
		
		
		

		sc.close();
	}

}
