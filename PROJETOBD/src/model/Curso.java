package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Curso")
public class Curso {
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codigo", unique=true)
	private String codigo;
	
	@Column(name="nomeCurso")
	private String nomeCurso;
	
	@Column(name="numeroCreditoConclusao")
	private int numeroCreditoConclusao;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="idDepartamento")
	private Departamento departamento;
	
	
	@OneToMany(
			mappedBy="curso",
			fetch=FetchType.LAZY
	)
	private List<Matricula> matriculas = new ArrayList<>();
	
	public Curso(String codigo, String nomeCurso, int numeroCreditoConclusao, Departamento departamento) {
		this.codigo = codigo;
		this.nomeCurso = nomeCurso;
		this.numeroCreditoConclusao = numeroCreditoConclusao;
		this.departamento = departamento;
	}
	
	public Curso(){
		
		
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	

	
}
