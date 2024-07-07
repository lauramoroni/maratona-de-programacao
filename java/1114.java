package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002, entrada;
		
		entrada = sc.nextInt();
		
		while (entrada != senha) {
			
			System.out.println("Senha Invalida");
			
			entrada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
