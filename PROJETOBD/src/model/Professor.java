package model;

import java.util.ArrayList;

public class Professor {
	private String matricula;
	private String cfe;
	private String nome;
	private String sobrenome;
	private Departamento departamento;
	//private String codigoDepartamento;
	private ArrayList<Disciplina> disciplinas;
	
	public Professor(String matricula, String cfe, String nome, String sobrenome, Departamento departamento) {
		this.matricula = matricula;
		this.cfe = cfe;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.departamento = departamento;
		//this.codigoDepartamento = codigoDepartamento;
		this.disciplinas = new ArrayList<>();
	}
	
	public Professor(){
		this.disciplinas = new ArrayList<>();
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

	/*public String getCodigDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}*/

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	
	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
