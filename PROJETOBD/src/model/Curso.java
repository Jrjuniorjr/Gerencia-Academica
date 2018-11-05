package model;

public class Curso {
	private String codigo;
	private String nomeCurso;
	private int numeroCreditoConclusao;
	private Departamento departamento;
	//private String codigoDepartamento;
	
	public Curso(String codigo, String nomeCurso, int numeroCreditoConclusao, Departamento departamento) {
		this.codigo = codigo;
		this.nomeCurso = nomeCurso;
		this.numeroCreditoConclusao = numeroCreditoConclusao;
		this.departamento = departamento;
		//this.codigoDepartamento = codigoDepartamento;
	}
	
	public Curso(){
		
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getNumeroCreditoConclusao() {
		return numeroCreditoConclusao;
	}

	public void setNumeroCreditoConclusao(int numeroCreditoConclusao) {
		this.numeroCreditoConclusao = numeroCreditoConclusao;
	}

	/*public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}*/

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	

	
}
