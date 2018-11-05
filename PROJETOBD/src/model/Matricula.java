package model;

import java.sql.Date;

public class Matricula {
	private Aluno aluno;
	private Curso curso;
	private String matricula;
	private Date dataInicio;
	//private ArrayList<Disciplina> disciplinasCursadas;
	//private ArrayList<Disciplina> disciplinasCursando;
	
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
