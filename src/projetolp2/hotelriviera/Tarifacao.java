package projetolp2.hotelriviera;

public class Tarifacao {
	ServicosHotel servico;
	
	public Tarifacao (ServicosHotel servico) {
		this.servico = servico;
	}
	
	public double tarifacaoNormal () {
		return servico.getValorServico();
	}
	
	public double tarifacaoAltaEstacao () {
		return servico.getValorServico() * 2;
	}
	
	public double tarifacaoBaixaEstacao () {
		return servico.getValorServico() * 0.8;
	}
	
}
