package la�osCondicionais;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			
			int idade; 
			
			System.out.print("\nDigite a sua idade: ");
			idade=leia.nextInt();
			
			if (idade >= 10 && idade< 14)
				System.out.println("Voc� se encaixa na categoria Juvenil...");
			    			  
			if (idade >= 15 && idade<17)
				System.out.println("Voc� se encaixa na categoria Infantil...");
			    
			else if (idade >= 18 && idade < 25)
				System.out.println("Voc� se encaixa na categoria Adulto...");
			
			else 
				System.out.println("Voc� n�o se encaixa em nenhuma das categorias...");
		}
			
	}

}
