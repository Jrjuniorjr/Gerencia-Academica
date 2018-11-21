package model;

import java.sql.Date;

public class HistoricoEscolar {
	//private int id;
	private int idMatricula;
	private int idDisciplina;
	private double notaFinal;
	private Date dataCursada;
	
	public HistoricoEscolar(int idMatricula, int idDisciplina, double notaFinal,
			Date dataCursada) {
		super();
		this.idMatricula = idMatricula;
		this.idDisciplina = idDisciplina;
		this.notaFinal = notaFinal;
		this.dataCursada = dataCursada;
	}
	
	public HistoricoEscolar(){
		
	}

	
	
	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
*/
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

	public int getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}


	
	
	
}
