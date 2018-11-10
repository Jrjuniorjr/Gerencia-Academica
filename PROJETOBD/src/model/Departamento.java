package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Departamento")
public class Departamento {
	
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="codigo", unique=true)
	private String codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="bloco")
	private char bloco;
	
	@OneToMany(
			mappedBy="departamento",
			fetch= FetchType.LAZY
	)
	private List<Professor> professores = new ArrayList<>();
	
	@OneToMany(
			mappedBy="departamento",
			fetch= FetchType.LAZY
	)
	private List<Curso> cursos = new ArrayList<>();
	
	
	@OneToMany(
			mappedBy="departamento",
			fetch=FetchType.LAZY
	)
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Departamento(String codigo, String nome, char bloco){
		this.codigo = codigo;
		this.nome = nome;
		this.bloco = bloco;
	//	professores = new ArrayList<>();
		//cursos = new ArrayList<>();
		//disciplinas = new ArrayList<>();
	}
	
	
	public Departamento(){
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
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

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public void addProfessor(Professor professor){
		professores.add(professor);
	}
	
	public void addCurso(Curso curso){
		cursos.add(curso);
	}
	
	public void addDisciplina(Disciplina disciplina){
		disciplinas.add(disciplina);
	}
	
	
	
}
