package projetolp2.hotelriviera;

public class ExecutivoTriplo extends Executivo {
	private final static double VALOR_DIARIA_EXTRIPLO= 440;
	
	public ExecutivoTriplo(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_EXTRIPLO);
	}

}
