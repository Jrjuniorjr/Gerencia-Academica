package model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="Matricula")
public class Matricula {
	
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="idAluno"
	)
	private Aluno aluno;
	
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="idCurso"
	)
	private Curso curso;
	
	@Column(name="numeroMatricula")
	private String matricula;
	
	@Column(name="dataInicio")
	private Date dataInicio;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo", columnDefinition="enum('Ativo', 'Inativo')")
	private StatusMatriculaEnum statusMatricula;
	
	public Matricula(Aluno aluno, Curso curso, Date dataInicio,
			StatusMatriculaEnum statusMatricula) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.matricula = gerarMatricula();
		this.dataInicio = dataInicio;
		this.statusMatricula = statusMatricula;
	}
	
	public Matricula(){
		
	}
	
	public String gerarMatricula() {
		Calendar cal = Calendar.getInstance();
		String matriculaGerada;
		
		matriculaGerada = Integer.toString(cal.get(Calendar.DAY_OF_YEAR));
		matriculaGerada = matriculaGerada + this.getCurso().getCodigo();
		matriculaGerada = matriculaGerada + Integer.toString(this.getId());
		
		return matriculaGerada;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public StatusMatriculaEnum getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(StatusMatriculaEnum statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	
	
	
}
