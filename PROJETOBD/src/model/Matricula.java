package model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="Matricula")
public class Matricula {
	
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
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="data_inicio")
	private Date dataInicio;
	
	
	public Matricula(Aluno aluno, Curso curso, String matricula, Date dataInicio) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.matricula = matricula;
		this.dataInicio = dataInicio;
	}
	
	public Matricula(){
		
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
	
	
}
