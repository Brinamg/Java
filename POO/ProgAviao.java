package POO;

public class ProgAviao {
	
	public static void main (String args[])
	{
		aviao aviao1 = new aviao();
		aviao1.modelo = "Airbus A340-600";
		aviao1.tamanho = 59;
		aviao1.motores = "General Electric CF6-80E1";
		aviao1.atualAltitude = 400;
		aviao1.mAltitude = 700;
		
		aviao1.decolar();
		
		aviao1.AltitudeM(100);
		System.out.println(aviao1.atualAltitude);
		aviao1.Al();
	}

}
