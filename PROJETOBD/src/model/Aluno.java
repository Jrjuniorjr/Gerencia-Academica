package model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class Aluno {
	private String cpf;
	private String nome;
	private String sobrenome;
	private Enum tipo;
	private Date dataNascimento;
	
	@OneToOne(cascade=
	CascadeType.ALL)
	private Endereco endereco;
	
	private ArrayList<Matricula> matriculas;

	
	
	public Aluno(String cpf, String nome,
			String sobrenome, Enum tipo,
			Date dataNascimento, Endereco endereco) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipo = tipo;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.matriculas = new ArrayList<>();
	}
	
	public Aluno(){
		
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
