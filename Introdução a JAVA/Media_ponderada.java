package Projeto;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;

public class Media_ponderada {

		public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			
			Float n1, n2, n3, media; 
			
			System.out.print("\nDigite a primeira nota: ");
			n1 = leia.nextFloat();
			
			System.out.print("\nDigite a segunda nota: ");
			n2 = leia.nextFloat();
			
			System.out.print("\nDigite a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = ((n1 * 2 + n2 * 3 + n3 * 5) / 10);
			System.out.printf("\nA sua média é: %2.2f",media);
			
		}
		
		
		
	}

}
