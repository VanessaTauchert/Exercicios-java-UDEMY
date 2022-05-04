package ex2;

public class Lampada {
	
	String estado = "on";
	static int click;
	

	void clicks() {
		click++;
		
		if(click % 2 == 0) {
			estado = "off";
			System.out.println("lampada desligada");
		}else if (click >=4) {
			estado = "off";
			System.out.println("lampada queimada");
		} else {
			estado = "on";
			System.out.println("lampada ligada");
		}
	}

	void mostar() {
		System.out.println(estado + " é o estado da lampada");
	}
		
	
}
