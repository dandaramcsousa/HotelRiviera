package projetolp2.hotelriviera;

public abstract class Carro {
	private double valorDiaria;
	private boolean tanqueCheio;
	private boolean seguro;
	protected final static int TANQUE_CHEIO = 150;
	protected final static int SEGURO = 100;
	
	public Carro (double diaria, boolean tanque, boolean seguroCarro) {
		this.valorDiaria = diaria;
		this.tanqueCheio = tanque;
		this.seguro = seguroCarro;
	}
	
		public double getValorDiaria() {
		return valorDiaria;
	}

		public void setValorDiaria(double valorDiaria) {
			this.valorDiaria = valorDiaria;
		}

		public boolean isTanqueCheio() {
		return tanqueCheio;
	}

	public boolean isSeguro() {
		return seguro;
	}
	
	public abstract double totalAPagar ();
}
