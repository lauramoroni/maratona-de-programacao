package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
