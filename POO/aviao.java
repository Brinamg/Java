package POO;

public class aviao {
	
		private String modelo;
		private int tamanho;
		public String motores;
		public int velocidade;
		public int altitude;
		
		public aviao(String modelo, int tamanho, String motores, int velocidade, int altitude) {
			// TODO Auto-generated constructor stub
			this.modelo = modelo;
			this.motores = motores;
			this.velocidade = velocidade;
			this.altitude = altitude;
			
				
		}

		
		
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



		void aumentarAltitude(int metros) {
			
			altitude += metros;
			aviao1.aumentarAltitude(5);
			
			
		}
		
		public int getAumentarAltitude()
		{
		int aumentarAltitude =	altitude;
		return aumentarAltitude;
		
		}
		void reduzirAltitude(int metros) {
			
			altitude -= metros;
			aviao2.reduzirAltitude(2);			
		}
		
		public int getReduzirAltitude()
		{
		int reduzirAltitude =	altitude;
		return reduzirAltitude;
		
		}

		void aumentarVelocidade(int acelerar) {
	
			velocidade += acelerar;
			aviao1.aumentarVelocidade(3);	
		}
		
		public int getAumentarVelocidade()
		{
		int aumentarVelocidade =	velocidade;
		return aumentarVelocidade;
		
		}

		void reduzirVelocidade(int desacelerar) {
	
			velocidade += desacelerar;
			aviao1.reduzirVelocidade(3);	
		}
		
		public int getReduzirVelocidade()
		{
		int reduzirVelocidade =	velocidade;
		return reduzirVelocidade;
		
		}


		
	}


