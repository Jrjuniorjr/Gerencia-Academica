package model;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name="Professor")
public class Professor {
	@Id
	@Column(name="matricula_prof")
	private String matricula;
	
	@Column(name="CFE")
	private String cfe;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Sobrenome")
	private String sobrenome;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="codigo_departamento")
	private Departamento departamento;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codigo_disciplina")
	private ArrayList<Disciplina> disciplinas = new ArrayList<>();
	
	public Professor(String matricula, String cfe, String nome, String sobrenome, Departamento departamento) {
		this.matricula = matricula;
		this.cfe = cfe;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.departamento = departamento;
		//this.disciplinas = new ArrayList<>();
	}
	
	public Professor(){
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCfe() {
		return cfe;
	}
	public void setCfe(String cfe) {
		this.cfe = cfe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
