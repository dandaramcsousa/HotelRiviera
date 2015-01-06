package projetolp2.hotelriviera;

public class CarroExecutivo extends Carro {
	private final static double DIARIA_CARRO_EXECUTIVO = 60;
	
	public CarroExecutivo(boolean tanque, boolean seguroCarro) {
		super(DIARIA_CARRO_EXECUTIVO, tanque, seguroCarro);
	}

	@Override
	public double totalAPagar() {
		double valorAPagar = 0; 
		if (isSeguro()) valorAPagar += SEGURO;
		if (isTanqueCheio()) valorAPagar += TANQUE_CHEIO;
		valorAPagar += DIARIA_CARRO_EXECUTIVO;
		
		return valorAPagar;
	}
}
