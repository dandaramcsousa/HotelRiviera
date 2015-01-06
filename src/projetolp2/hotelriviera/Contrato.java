package projetolp2.hotelriviera;

import java.util.*;

public class Contrato {
	private Hospede hospede;
	private String numeroCartao;
	private int numeroDias;
	private Quarto quarto;
	private ArrayList<Adicional> adicionais;
	
	public Contrato (Hospede hospede, String numeroCartao, int numeroDias, Quarto quarto) {
		adicionais = new ArrayList<Adicional>();
		this.hospede = hospede;
		this.numeroCartao = numeroCartao;
		this.numeroDias = numeroDias;
		this.quarto = quarto;
	}
	
	public boolean adicionaAdicionais (Adicional adicional) {
		return adicionais.add(adicional);
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public ArrayList<Adicional> getAdicionais() {
		return adicionais;
	}
}
