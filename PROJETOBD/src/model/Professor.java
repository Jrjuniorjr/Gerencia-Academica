package model;


import java.util.ArrayList;
import java.util.List;

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
	
	@OneToMany(
			mappedBy="professor",
			fetch= FetchType.LAZY
	)
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public Professor(String matricula, String cfe, String nome, String sobrenome, Departamento departamento) {
		this.matricula = matricula;
		this.cfe = cfe;
		this.nome = nome;
		this.sobrenome = sobrenome;
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
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
