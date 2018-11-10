package model;

public class DisciplinasPeriodoAtual {
	private int id;
	private String matriculaAluno;
	private String codigoDisciplina;
	private double primeiroGQ;
	private double segundoGQ;

	public DisciplinasPeriodoAtual(int id, String matriculaAluno, String codigoDisciplina, double primeiroGQ,
			double segundoGQ) {
		super();
		this.id = id;
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
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
