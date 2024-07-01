package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius, area, pi = 3.14159;
		radius = sc.nextDouble();
		area = pi * Math.pow(radius, 2);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}

}
