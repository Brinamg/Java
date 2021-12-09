package Projeto;

import java.util.Scanner;

public class Idade_em_anos_meses_dias {

		public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int idade, meses, idias, dias;
			
			System.out.println("\nDigite a sua idade em dias: ");
			idias = leia.nextInt();
			
			System.out.println("\n A sua idade é:");
			
			idade = (idias / 365);
			System.out.print("\n Anos: "+idade);
			
			meses = (idias % 365) / 30;
			System.out.print("\n Meses: "+meses);
			
			dias = (idias % 365) % 30;
			System.out.print("\n Dias: "+dias);
		}
		
		
		
	}

}
