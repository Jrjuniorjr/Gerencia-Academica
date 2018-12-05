package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="Disciplina")
public class Disciplina {

	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codigo", unique=true)
	private String codigo;

	@Column(name="numeroTotalHoras")
	private int numTotalHoras;

	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(name="idDepartamento")
	private Departamento departamento;

	@Column(name="cargaHoraria")
	private int cargaHoraria;

	@Column(name="credito")
	private int credito;
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo", columnDefinition="enum('Ativo', 'Inativo')")
	private StatusAtivacao statusDisciplina;
	
	
	@Column(name="nomeDisciplina")
	private String nomeDisciplina;

	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(name="idProfessor")
	private Professor professor;
	
	@OneToMany(
			mappedBy="disciplina"
	)
	private List<HistoricoEscolar> historico = new ArrayList<>();
	@OneToMany(
			mappedBy="disciplina",
			fetch = FetchType.LAZY
	)
	private List<DisciplinasPeriodoAtual> disciplinasPeriodoAtuals = new ArrayList<>();
	
		
	
	public Disciplina(String codigo, int numTotalHoras, Departamento departamento,
			int cargaHoraria, int credito, StatusAtivacao statusDisciplina,
			String nomeDisciplina, Professor professor) {
		super();
		this.codigo = codigo;
		this.numTotalHoras = numTotalHoras;
		this.departamento = departamento;
		this.cargaHoraria = cargaHoraria;
		this.credito = credito;
		this.nomeDisciplina = nomeDisciplina;
		this.professor = professor;
		this.statusDisciplina = statusDisciplina;
		
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
	
	public StatusAtivacao getStatusDisciplina() {
		return statusDisciplina;
	}

	public void setStatusDisciplina(StatusAtivacao statusDisciplina) {
		this.statusDisciplina = statusDisciplina;
	}



	public String getNomeDisciplina() {
		return nomeDisciplina;
	}


	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public List<HistoricoEscolar> getHistorico() {
		return historico;
	}

	public void setHistorico(List<HistoricoEscolar> historico) {
		this.historico = historico;
	}

	public List<DisciplinasPeriodoAtual> getDisciplinasPeriodoAtuals() {
		return disciplinasPeriodoAtuals;
	}

	public void setDisciplinasPeriodoAtuals(List<DisciplinasPeriodoAtual> disciplinasPeriodoAtuals) {
		this.disciplinasPeriodoAtuals = disciplinasPeriodoAtuals;
	}

	
	
	
}
