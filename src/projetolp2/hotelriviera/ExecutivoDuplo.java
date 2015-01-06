package projetolp2.hotelriviera;

public class ExecutivoDuplo extends Executivo {
	private final static double VALOR_DIARIA_EXDUPLO= 385;
	
	public ExecutivoDuplo(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_EXDUPLO);
	}
}
