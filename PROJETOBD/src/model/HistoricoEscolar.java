package model;

import java.sql.Date;

public class HistoricoEscolar {
	private int id;
	private String matriculaAluno;
	private String codigoDisciplina;
	private double notaFinal;
	private Date dataCursada;
	
	public HistoricoEscolar(int id, String matriculaAluno, String codigoDisciplina, double notaFinal,
			Date dataCursada) {
		super();
		this.id = id;
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
		this.notaFinal = notaFinal;
		this.dataCursada = dataCursada;
	}
	
	public HistoricoEscolar(){
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public Date getDataCursada() {
		return dataCursada;
	}

	public void setDataCursada(Date dataCursada) {
		this.dataCursada = dataCursada;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	
	
	
	
}
