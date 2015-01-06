package projetolp2.hotelriviera;

public class AluguelCarro implements Adicional {
	Carro carro;
	
	public AluguelCarro (Carro carro) {
		this.carro = carro;
	}
	@Override
	public double getValorServico() {
		return getCobranca();
	}

	@Override
	public double getCobranca() {
		return carro.totalAPagar();
	}
}
