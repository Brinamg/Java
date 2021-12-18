package HerançaPolimorfismo;

public class Cavalo extends Animal {

			
	private boolean corre;

	public Cavalo(String nome, int idade, boolean corre) {
		super(nome, idade);
		this.corre = corre;
	}

	
	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	public boolean eCorre() {
		return corre;
	}

	public void setCorrer(boolean corre) {
		this.corre = corre;
	}

	public void imprimirInfo() {
		System.out.println("\nCavalo\nNome:" + getNome() + "Idade: " + getIdade() + "\nSom:" + getSom());
	}

	public void imprimirAcao() {
		if (eCorre() == true)
			;
		{

			System.out.println("\nCorre");
		}

	}
}