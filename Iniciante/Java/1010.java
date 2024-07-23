package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id1, number1, id2, number2;
		double price1, price2, total;
		
		id1 = sc.nextInt();
		number1 = sc.nextInt();
		price1 = sc.nextDouble();
		sc.nextLine();
		id2 = sc.nextInt();
		number2 = sc.nextInt();
		price2 = sc.nextDouble();
		
		total = number1 * price1 + number2 * price2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}

}
