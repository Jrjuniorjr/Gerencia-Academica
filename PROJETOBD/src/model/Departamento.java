package model;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name="Departamento")
public class Departamento {
	@Id
	@Column(name="codigo")
	private String codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="bloco")
	private char bloco;
	
	@OneToMany(
			mappedBy="departamento",
			fetch= FetchType.LAZY
	)
	private ArrayList<Professor> professores = new ArrayList<>();
	
	@OneToMany(
			mappedBy="departamento",
			fetch= FetchType.LAZY
	)
	private ArrayList<Curso> cursos = new ArrayList<>();
	
	@OneToMany(
			mappedBy="departamento",
			fetch=FetchType.LAZY
	)
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();
	
	public Departamento(String codigo, String nome, char bloco){
		this.codigo = codigo;
		this.nome = nome;
		this.bloco = bloco;
		professores = new ArrayList<>();
		cursos = new ArrayList<>();
		disciplinas = new ArrayList<>();
	}
	
	
	public Departamento(){
		
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getBloco() {
		return bloco;
	}
	public void setBloco(char bloco) {
		this.bloco = bloco;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	/*public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}*/
	
	public void addProfessor(Professor professor){
		professores.add(professor);
	}
	
	public void addCurso(Curso curso){
		cursos.add(curso);
	}
	
	/*public void addDisciplina(Disciplina disciplina){
		disciplinas.add(disciplina);
	}*/
	
	
	
}
