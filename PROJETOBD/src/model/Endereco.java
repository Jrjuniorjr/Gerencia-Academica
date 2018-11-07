package model;

import javax.persistence.*;

@Entity
@Table(name="Endereco")
public class Endereco {
	
	@Id
	@Column(name="cpf_aluno")
	private String alunoCpf;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="bairro")
	private String bairro;

	public Endereco() {
		
	}
	
	public String getAlunoCpf() {
		return alunoCpf;
	}

	public void setAlunoCpf(String alunoCpf) {
		this.alunoCpf = alunoCpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	
}
