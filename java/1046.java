package estruturasCondicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int start, end, time;

		start = sc.nextInt();
		end = sc.nextInt();

		if (start < end) {
			time = end - start;
		} else {
			time = 24 - start + end;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", time);

		sc.close();
	}

}
