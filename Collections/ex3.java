package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opçao;
		Scanner leia = new Scanner(System.in);
			
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			
			System.out.println("\n\t\tMenu do meu Estoque");
			System.out.println("\n(1) Armazenar um produto no estoque");
			System.out.println("\n(2) Remover um produto do estoque?");
			System.out.println("\n(3) Atualizar um produto no estoque?");
			System.out.println("\n(4) Todos os produtos do estoque.");
			System.out.println("\n(0) Sair do programa.");
			System.out.println("\nSelecione uma opção: ");
		
			opçao=leia.nextInt();
			
			switch(opçao)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nAdicione um produto ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nRemova do estoque: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existente no estoque.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do novo produto"+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não inexistente!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nMostrar os produtos do estoque");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nSistema finalizado.");
				
			}
			
		}while(opçao!=0);

	}

}
