package projetolp2.hotelriviera;

public class CarroLuxo extends Carro {
	private final static double DIARIA_CARRO_LUXO = 100;

	public CarroLuxo(boolean tanque, boolean seguroCarro) {
		super(DIARIA_CARRO_LUXO, tanque, seguroCarro);
	}

	@Override
	public double totalAPagar() {
		double valorAPagar = 0; 
		if (isSeguro()) valorAPagar += SEGURO;
		if (isTanqueCheio()) valorAPagar += TANQUE_CHEIO;
		valorAPagar += DIARIA_CARRO_LUXO;
		
		return valorAPagar;
	}
}
