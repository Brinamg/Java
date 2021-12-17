package POO;

public class ProgCliente {
	
	public static void main (String args[])
	{
		Cliente cliente1 = new Cliente("Michele",22,"569.321.488-45" );
		Cliente cliente2 = new Cliente("Arthur", 32,"478.632.149-96");
		System.out.println(cliente1.getNome()+"\nidade: "+cliente1.getIdade()+"\ncpf: "+cliente1.getCpf());
		System.out.println(cliente2.getNome()+"\nidade: "+cliente2.getIdade()+"\ncpf: "+cliente2.getCpf());
	}


}
