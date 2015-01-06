package projetolp2.hotelriviera;

public class Quarto implements ServicosHotel {
	private int numeroPessoas;
	private double valorDiaria;
	
	public Quarto (int numeroDePessoas, int limitePessoasQuarto, double diaria) throws Exception {
		checaExcecoes(numeroDePessoas, limitePessoasQuarto);
		this.numeroPessoas = numeroDePessoas;
		this.valorDiaria = diaria;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	
	private void checaExcecoes (int pessoas, int limitePessoasQuarto) throws Exception {
		if (!(pessoas > 0 && pessoas <= limitePessoasQuarto)) {
			throw new Exception("A quantidade de pessoas no quarto não pode exceder o limite"
					+ "estabelecido de " + limitePessoasQuarto + " pessoas.");
		}
	}

	@Override
	public double getValorServico() {
		return getValorDiaria();
	}

}
