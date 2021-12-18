package HerançaPolimorfismo;

public class Cachorro extends Animal {
	
	private String emiteSom;
	private String corre;
	
	
	public Cachorro(String nome, int idade, String emiteSom, String corre)
	{
		super(nome, idade);
		this.emiteSom = emiteSom;
		this.corre = corre;
	}


	public String getEmiteSom() {
		return emiteSom;
	}


	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}


	public String getCorre() {
		return corre;
	}


	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	

}	


