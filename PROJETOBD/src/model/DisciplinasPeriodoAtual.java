package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cursando")
public class DisciplinasPeriodoAtual {
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="idMatricula"
	)
	private Matricula matricula;
	
	@ManyToOne(
			fetch= FetchType.EAGER
	)
	@JoinColumn(
			name= "idDisciplina"
	)
	private Disciplina disciplina;
	
	@Column(name = "primeiroGQ")
	private double primeiroGQ;
	
	@Column(name = "segundoGQ")
	private double segundoGQ;

	public DisciplinasPeriodoAtual(Matricula matricula, Disciplina disciplina, double primeiroGQ,
			double segundoGQ) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
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



	public Matricula getMatricula() {
		return matricula;
	}



	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}



	public Disciplina getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	

	
}
