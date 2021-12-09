package laçosCondicionais;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			
			int idade; 
			
			System.out.print("\nDigite a sua idade: ");
			idade=leia.nextInt();
			
			if (idade >= 10 && idade< 14)
				System.out.println("Você se encaixa na categoria Juvenil...");
			    			  
			if (idade >= 15 && idade<17)
				System.out.println("Você se encaixa na categoria Infantil...");
			    
			else if (idade >= 18 && idade < 25)
				System.out.println("Você se encaixa na categoria Adulto...");
			
			else 
				System.out.println("Você não se encaixa em nenhuma das categorias...");
		}
			
	}

}
