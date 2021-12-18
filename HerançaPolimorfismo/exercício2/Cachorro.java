package HerançaPolimorfismo;

public class Cachorro extends Animal {

	private boolean corre;

	public Cachorro(String nome, int idade, boolean corre) {
		super(nome, idade);
		this.corre = corre;
	}

	
	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	public boolean Corre() {
		return corre;
	}

	public void setCorrer(boolean corre) {
		this.corre = corre;
	}

	public void imprimirInfo() {
		System.out.println("\nCachorro\nNome:" + getNome() + "Idade: " + getIdade() + "\nSom:" + getSom());
	}

	public void imprimirAcao() {
		if (Corre() == true)
			
		{

			System.out.println("\nCorre");
		}

	}
}
