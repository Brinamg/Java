package ListadeExercíciosArrays_java;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {

	int[][] numeros = new int[3][3];
	int somaM10 = 0, linha = 0, coluna;

	Scanner leia = new Scanner(System.in);
	
	for(linha=0;linha<3;linha++)
	{
	for(coluna=0;coluna<3;coluna++)
	{
		System.out.println("\nEntre com um número: ");
		numeros[linha][coluna] = leia.nextInt();

		
			if(numeros[linha][coluna] > 10)
			{
				somaM10++;
			}
	}
	}System.out.println("\nQuantidade de números maiores que 10: "+somaM10);
}

}
