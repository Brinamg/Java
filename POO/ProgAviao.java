package POO;

public class ProgAviao {
	
	public static void main (String args[])
	{
		aviao aviao1 = new aviao("Airbus A380",72, "GP7270", 900, 560);
		aviao aviao2 = new aviao("Airbus A340-600", 59, "General Electric CF6-80E1", 859, 490);
		System.out.println("Altitude\n"+aviao1.getModelo()+"\n"+aviao1.getAumentarAltitude()+"\n"+aviao2.getReduzirAltitude());
		System.out.println("\nVelocidade\n"+aviao2.getModelo()+"\n"+aviao1.getAumentarVelocidade()+"\n"+aviao2.getReduzirVelocidade());
	}

}
