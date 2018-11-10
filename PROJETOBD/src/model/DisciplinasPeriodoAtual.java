package model;

public class DisciplinasPeriodoAtual {
	private int id;
	private int idMatricula;
	private int idDisciplina;
	private double primeiroGQ;
	private double segundoGQ;

	public DisciplinasPeriodoAtual(int idMatricula, int idDisciplina, double primeiroGQ,
			double segundoGQ) {
		super();
		this.idMatricula = idMatricula;
		this.idDisciplina = idDisciplina;
		this.primeiroGQ = primeiroGQ;
		this.segundoGQ = segundoGQ;
	}



	public DisciplinasPeriodoAtual(){
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPrimeiroGQ() {
		return primeiroGQ;
	}
	public void setPrimeiroGQ(double primeiroGQ) {
		this.primeiroGQ = primeiroGQ;
	}
	public double getSegundoGQ() {
		return segundoGQ;
	}
	public void setSegundoGQ(double segundoGQ) {
		this.segundoGQ = segundoGQ;
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
