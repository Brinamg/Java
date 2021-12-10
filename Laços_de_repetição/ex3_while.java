package Laços_de_repetição;

import java.util.Scanner;

public class ex3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, menosV = 0, maiorC = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();

		while (idade != -90) {
			if (idade < 21) {
				menosV++;
			}

			if (idade > 50) {
				maiorC++;
			}

			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();

		}
		System.out.println("\nA quantidade de pessoas com idade inferior a 21 anos é igual a: " + menosV);
		System.out.println("\nA quantidade de pessoas com idade superior a 50 anos é igual a: " + maiorC);

	}

}
