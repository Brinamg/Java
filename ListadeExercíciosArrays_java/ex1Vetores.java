package ListadeExercíciosArrays_java;

import java.util.Scanner;

public class ex1Vetores {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		int[] A = {1, 0, 5, -2, -5, 7};
		int S = 0;
		
		Scanner leia = new Scanner(System.in);
		
		S = (int) A[0] + A[1] + A[2];
		A[4] = 100;
		
		
		System.out.println("\nSoma: " + S );
		System.out.println("\nA = " + A[0]+" , "+ A[1]+" , "+ A[2]+" , "+ A[3]+" , "+ A[4]+" , "+A[5]);
		
		
	}
}
