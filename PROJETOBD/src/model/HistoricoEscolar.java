package model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Historico")
public class HistoricoEscolar {
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

	@Column(name = "notaFinal")
	private double notaFinal;
	private Date dataCursada;
	
	
	public HistoricoEscolar(Matricula matricula, Disciplina disciplina, double notaFinal,
			Date dataCursada) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
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

	public Matricula getMatricula() {
		return this.matricula;
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
