package POO;

public class aviao {
	
		String modelo;
		int tamanho;
		String motores;
		double atualAltitude;
		double mAltitude;
	
				
		
		public String getModelo() {
			return modelo;
		}



		public void setModelo(String modelo) {
			this.modelo = modelo;
		}



		public int getTamanho() {
			return tamanho;
		}



		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}


		void decolar()
		{
			System.out.println("O avião decolou...");
		}
		
		void AltitudeM(int metros) {
			
			double novaAltitude = this.atualAltitude+metros;
			this.atualAltitude = novaAltitude;
		}
		int Al(){
			if(this.atualAltitude<0)
			{
			return -1;
			
			}
			if(this.atualAltitude>=0 && this.atualAltitude<520) {
				return 1;
			}
			if(this.atualAltitude>=500 &&this.atualAltitude<700) {
				return 2;
			}
			return 3;
		}
        
				
	}


