package EstruturasRepetitivas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma = soma+x;
			
		
		}
		
		//exemplo for regressivo
		for (int i=4; i>=0; i--) {
			System.out.println("valor: " + i);
			}
		
		//exemplo for progressivo
		for (int i=0; i<5; i++) {
			System.out.println("valor: " + i);
			}
		
		System.out.println(soma);
		sc.close();
		
		
	}
	
	
	

}
