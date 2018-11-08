package model;

public class DisciplinasPeriodoAtual {
	private double primeiroGQ;
	private double segundoGQ;
	private String matriculaAluno;
	private String codigoDisciplina;
	
	
	public DisciplinasPeriodoAtual(double primeiroGQ, double segundoGQ, String matriculaAluno,
			String codigoDisciplina) {
		super();
		this.primeiroGQ = primeiroGQ;
		this.segundoGQ = segundoGQ;
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public DisciplinasPeriodoAtual(){
		
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
