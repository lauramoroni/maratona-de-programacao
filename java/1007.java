package estruturasSequenciais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, ans;
		
		A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();
		
		ans = A * B - C * D;
		
		System.out.printf("DIFERENCA = %d", ans);
		
		sc.close();
	}

}
