package la�osCondicionais;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("\nEntre com o valor de x: ");
			x = leia.nextInt();
			System.out.println("\nEntre com o valor de y: ");
			y = leia.nextInt();
			System.out.println("\nEntre com o valor de z: ");
			z = leia.nextInt();
		}
		
		if(x > y && x > z)
		{
			System.out.println("\nO x = "+ x + " � o maior n�mero...");
		}
		else if(y > x && y < z)
		{
			System.out.println("\nO y = "+ y + " � o maior n�mero..." );
		}
		else
		{
			System.out.println("\nO z = "+ z +" � o maior n�mero...");
		}
	}

	
}
