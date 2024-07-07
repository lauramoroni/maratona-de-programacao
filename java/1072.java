package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int in = 0, out = 0, x;
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
			
		}
		
		System.out.printf("%d in%n%d out%n", in, out);
		
		sc.close();
	}

}
