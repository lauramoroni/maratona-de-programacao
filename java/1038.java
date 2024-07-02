package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int id, qtd;
		double total;
		
		id = sc.nextInt();
		qtd = sc.nextInt();
		
		switch (id) {
		case 1:
			total = 4.0 * qtd;
			break;
		case 2:
			total = 4.5 * qtd;
			break;
		case 3:
			total = 5.0 * qtd;
			break;
		case 4:
			total = 2.0 * qtd;
			break;
		case 5:
			total = 1.5 * qtd;
			break;
		default:
			total = 0;
			break;
		}

		Locale.setDefault(Locale.US);
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
