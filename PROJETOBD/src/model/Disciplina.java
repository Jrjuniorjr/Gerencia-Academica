package model;

public class Disciplina {
	private String codigo;
	private int numTotalHoras;
	private String codigoDepartamento;
	private int cargaHoraria;
	private int credito;
	private String nomeDisciplina;
	private String numMatricula;
	//private ArrayList<Matricula> alunosCursando;
	//private ArrayList<Matricula> historico;
	
	
	public Disciplina(String codigo, int numTotalHoras, String codigoDepartamento,
			int cargaHoraria, int credito,
			String nomeDisciplina, String numMatricula) {
		super();
		this.codigo = codigo;
		this.numTotalHoras = numTotalHoras;
		this.codigoDepartamento = codigoDepartamento;
		this.cargaHoraria = cargaHoraria;
		this.credito = credito;
		this.nomeDisciplina = nomeDisciplina;
		this.numMatricula = numMatricula;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getNumTotalHoras() {
		return numTotalHoras;
	}


	public void setNumTotalHoras(int numTotalHoras) {
		this.numTotalHoras = numTotalHoras;
	}


	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}


	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public int getCredito() {
		return credito;
	}


	public void setCredito(int credito) {
		this.credito = credito;
	}


	public String getNomeDisciplina() {
		return nomeDisciplina;
	}


	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}


	public String getNumMatricula() {
		return numMatricula;
	}


	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	
	
	
}
