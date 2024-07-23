package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		if (x >= 0.0 && x <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (x > 25.0 && x <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (x > 50 && x <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (x > 75 && x <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
