package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double p1 = sc.nextDouble();
			double p2 = sc.nextDouble();
			double p3 = sc.nextDouble();
			
			double media = ((p1 * 2)+(p2 * 3)+(p3 * 5)) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
