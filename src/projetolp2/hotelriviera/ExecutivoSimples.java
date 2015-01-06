package projetolp2.hotelriviera;

public class ExecutivoSimples extends Executivo {
	private final static double VALOR_DIARIA_EXSIMPLES= 360;
	
	public ExecutivoSimples(int numeroDePessoas) throws Exception {
		super(numeroDePessoas, VALOR_DIARIA_EXSIMPLES);
	}

}
