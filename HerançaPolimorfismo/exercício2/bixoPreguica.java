package HerançaPolimorfismo;

	
	public class bixoPreguica extends Animal {
		
		private boolean sobe;

		public bixoPreguica(String nome, int idade, boolean sobe) {
			super(nome, idade);
			this.sobe = sobe;
		}

		
		public void setSobe1(boolean sobe) {
			this.sobe = sobe;
		}

		public boolean Sobe() {
			return sobe;
		}

		public void setSobe(boolean sobe) {
			this.sobe = sobe;
		}

		public void imprimirInfo() {
			System.out.println("\nCachorro\nNome:" + getNome() + "Idade: " + getIdade() + "\nSom:" + getSom());
		}


		public void imprimirAcao() {
			if (Sobe() == true)
			{

				System.out.println("\nSobe em árvores");
			}

	}
	}

