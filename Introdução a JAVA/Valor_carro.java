package Projeto;

import java.util.Scanner;

public class Valor_carro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int valor;
		double pord =  0.45;
		double pori = 0.28;
		double valorc;
		
		System.out.println("\nDigite o valor de fabrica do carro: ");
		valor = leia.nextInt();
		
		valorc = valor + (valor * pori) + (valor * pord);
		System.out.println("\nO valor pago pelo consumidor é: "+valorc);
	}
 	
  }
