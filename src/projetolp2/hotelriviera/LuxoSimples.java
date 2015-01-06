package projetolp2.hotelriviera;

public class LuxoSimples extends Luxo {
	private final static double VALOR_DIARIA_LSIMPLES = 520;
	
	public LuxoSimples(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_LSIMPLES);
	}

}
