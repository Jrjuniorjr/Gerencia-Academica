package model;

import java.util.ArrayList;

public class Departamento {
	private String codigo;
	private String nome;
	private char bloco;
	private ArrayList<Professor> professores;
	private ArrayList<Curso> cursos;
	private ArrayList<Disciplina> disciplina;
	
	public Departamento(String codigo, String nome, char bloco){
		this.codigo = codigo;
		this.nome = nome;
		this.bloco = bloco;
	}
	
	public Departamento(){
		
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

	public ArrayList<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ArrayList<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}
