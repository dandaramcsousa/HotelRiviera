package projetolp2.hotelriviera;

public class Executivo extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_EXECUTIVO = 3;
	private final static double VALOR_DIARIA = 0;

	public Executivo(int numeroDePessoas, double diaria) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_EXECUTIVO, VALOR_DIARIA);
		setValorDiaria(diaria);
	}

}
