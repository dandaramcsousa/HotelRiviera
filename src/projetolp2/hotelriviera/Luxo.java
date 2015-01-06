package projetolp2.hotelriviera;

public class Luxo extends Quarto {
	private final static int LIMITE_PESSOAS_QUARTO_LUXO = 3;
	private final static double VALOR_DIARIA = 0;

	public Luxo(int numeroDePessoas, double diaria) throws Exception {
		super(numeroDePessoas, LIMITE_PESSOAS_QUARTO_LUXO, VALOR_DIARIA);
		setValorDiaria(diaria);
	}
	
}
