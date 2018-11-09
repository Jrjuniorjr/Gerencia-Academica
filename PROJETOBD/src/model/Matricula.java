package model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="Matricula")
public class Matricula {
	
	@Id 
	@Column (name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="aluno_cpf"
	)
	private Aluno aluno;
	
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="codigo_curso"
	)
	private Curso curso;
	
	@Id
	@Column(name="num_matricula")
	private String matricula;
	
	@Column(name="data_inicio")
	private Date dataInicio;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="Tipo", columnDefinition="enum('Ativo', 'Inativo')")
	private StatusMatriculaEnum statusMatricula;
	
	public Matricula(Aluno aluno, Curso curso, Date dataInicio,
			StatusMatriculaEnum statusMatricula) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.matricula = this.gerarMatricula();
		this.dataInicio = dataInicio;
		this.statusMatricula = statusMatricula;
	}
	
	public Matricula(){
		
	}
	
	public String gerarMatricula() {
		Calendar cal = Calendar.getInstance();
		String matriculaGerada;
		
		matriculaGerada = Integer.toString(cal.get(Calendar.DAY_OF_YEAR));
		matriculaGerada = matriculaGerada + this.getCurso();
		matriculaGerada = matriculaGerada + Integer.toString(this.getId());
		
		return matriculaGerada;
	}
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
