package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, hours;
		double valueHour, salary;
		
		id = sc.nextInt();
		hours = sc.nextInt();
		valueHour = sc.nextDouble();
		salary = valueHour * hours;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", id, salary);
		
		sc.close();
		}

}
