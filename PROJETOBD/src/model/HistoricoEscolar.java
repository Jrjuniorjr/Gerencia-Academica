package model;

import java.sql.Date;

public class HistoricoEscolar {
	private double notaFinal;
	private Date dataCursada;
	private String matriculaAluno;
	private String codigoDisciplina;
	
	public HistoricoEscolar(double notaFinal, Date dataCursada, String matriculaAluno, String codigoDisciplina) {
		super();
		this.notaFinal = notaFinal;
		this.dataCursada = dataCursada;
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public HistoricoEscolar(){
		
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
