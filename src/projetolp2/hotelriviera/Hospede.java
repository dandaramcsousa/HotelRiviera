package projetolp2.hotelriviera;

import java.util.*;

public class Hospede {
	private String nomeHospede;
	private String endereco;
	private String CPF;
	private String telefoneContato;
	private Date dataNascimento;
	
	public Hospede (String nome, String endereco, String CPF, String telefoneContato, Date dataNascimento) throws Exception {
		if (nome == null || endereco == null || CPF == null || telefoneContato == null || dataNascimento == null) {
			throw new Exception("Os dados fornecidos não podem ser do tipo 'null'");
		}
		if (nome == "" || endereco == "" || CPF == "" || telefoneContato == ""){
			throw new Exception("Os dados fornecidos não podem conter uma String Vazia.");
		}
		nomeHospede = nome;
		this.endereco = endereco;
		this.CPF = CPF;
		this.telefoneContato = telefoneContato;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
