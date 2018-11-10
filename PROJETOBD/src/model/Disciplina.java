package model;

import javax.persistence.*;
@Entity
@Table(name="Disciplina")
public class Disciplina {

	@Id 
	@Column (name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codigo")
	private String codigo;

	@Column(name="num_total_horas")
	private int numTotalHoras;

	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(name="codigo_departamento")
	private Departamento departamento;

	@Column(name="carga_horaria")
	private int cargaHoraria;

	@Column(name="credito")
	private int credito;

	
	@Column(name="nome_disciplina")
	private String nomeDisciplina;

	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(name="num_matricula")
	private Professor professor;
	
		
	
	public Disciplina(int id, String codigo, int numTotalHoras, Departamento departamento,
			int cargaHoraria, int credito,
			String nomeDisciplina, Professor professor) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.numTotalHoras = numTotalHoras;
		this.departamento = departamento;
		this.cargaHoraria = cargaHoraria;
		this.credito = credito;
		this.nomeDisciplina = nomeDisciplina;
		this.professor = professor;
		
	}

	public Disciplina(){
		
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


	public int getNumTotalHoras() {
		return numTotalHoras;
	}


	public void setNumTotalHoras(int numTotalHoras) {
		this.numTotalHoras = numTotalHoras;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public int getCredito() {
		return credito;
	}


	public void setCredito(int credito) {
		this.credito = credito;
	}


	public String getNomeDisciplina() {
		return nomeDisciplina;
	}


	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	
	
	
}
