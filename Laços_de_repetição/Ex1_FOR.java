package La�os_de_repeti��o;

import java.util.Scanner;

public class Ex1_FOR {

	public static void main(String[] args) {

		float x, par = 0, impar = 0, contnum = 0;
		try (Scanner leia = new Scanner(System.in)) {

			for (contnum = 0; contnum <= 9; x++) {
				System.out.println("\nEntre com um n�mero: ");
				x = leia.nextFloat();
				contnum++;

				if (x % 2 == 0) {
					par++;

				} else {

					impar++;

				}

			}

			System.out.printf("\nH� %2.2f n�meros pares: ", par);
			System.out.printf("\nH� %2.2f n�meros �mpares: ", impar);

		}
	}
}