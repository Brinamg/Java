package La�os_de_repeti��o;

import java.util.Scanner;

public class ex5_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N, somaN = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com um n�mero: ");
		N = leia.nextInt();// 100

		do {

			somaN += N;

			System.out.println("\nEntre com um n�mero: ");
			N = leia.nextInt();

		} while (N != 0);

		System.out.println("\nA soma dos n�meros �: " + somaN);

	}

}
