package projetolp2.hotelriviera;

public class LuxoDuplo extends Luxo {
	private final static double VALOR_DIARIA_LDUPLO = 570;
	
	public LuxoDuplo(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_LDUPLO);
	}
}
