package projetolp2.hotelriviera;

public class LuxoTriplo extends Luxo {
	private final static double VALOR_DIARIA_LTRIPLO = 620;
	
	public LuxoTriplo(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_LTRIPLO);
	}

}
