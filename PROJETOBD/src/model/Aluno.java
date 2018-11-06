package model;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
//import org.hibernate.annotations.*;
import javax.persistence.*;

@Entity
@Table(name="Aluno")
public class Aluno {
	@Id
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
	private String sobrenome;
	
	@Column(name="tipoEntrada")
	private Enum tipo;
	
	@Column(name="data_nascimento")
	private Date dataNascimento;
	
	@OneToOne(cascade=
	CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Endereco endereco;
	
	
	@OneToMany(
			mappedBy="aluno",
			fetch = FetchType.LAZY
	)
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

	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
}
