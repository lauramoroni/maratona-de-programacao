package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int combustivel, alcool = 0, gas = 0, diesel = 0;
		
		combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			switch (combustivel) {
			case 1: 
				alcool++;
				break;
			case 2:
				gas++;
				break;
			case 3: 
				diesel++;
				break;
			case 4:
				break;
			}
			
			combustivel = sc.nextInt();
		}	
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d", alcool, gas, diesel);
		
		sc.close();
	}

}
