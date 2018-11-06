package model;

import javax.persistence.*;

@Entity
@Table(name="Curso")
public class Curso {
	@Id
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nome_curso")
	private String nomeCurso;
	
	@Column(name="num_credito_conclusao")
	private int numeroCreditoConclusao;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@Column(name="codigo_departamento")
	private Departamento departamento;
	
	public Curso(String codigo, String nomeCurso, int numeroCreditoConclusao, Departamento departamento) {
		this.codigo = codigo;
		this.nomeCurso = nomeCurso;
		this.numeroCreditoConclusao = numeroCreditoConclusao;
		this.departamento = departamento;
	}
	
	public Curso(){
		
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getNumeroCreditoConclusao() {
		return numeroCreditoConclusao;
	}

	public void setNumeroCreditoConclusao(int numeroCreditoConclusao) {
		this.numeroCreditoConclusao = numeroCreditoConclusao;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

	
}
