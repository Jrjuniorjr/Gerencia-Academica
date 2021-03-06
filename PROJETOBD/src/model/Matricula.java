package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Matricula")
public class Matricula {
	
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="idAluno"
	)
	private Aluno aluno;
	
	
	@ManyToOne(
			fetch=FetchType.EAGER
	)
	@JoinColumn(
			name="idCurso"
	)
	private Curso curso;
	
	@OneToMany(
			mappedBy="matricula",
			fetch = FetchType.LAZY
	)
	private List<HistoricoEscolar> historico = new ArrayList<>();
	
	@OneToMany(
			mappedBy="matricula",
			fetch = FetchType.LAZY
	)
	private List<DisciplinasPeriodoAtual> disciplinasPeriodoAtuals = new ArrayList<>();
	
	
	@Column(name="numeroMatricula")
	private String matricula;
	
	@Column(name="dataInicio")
	private Date dataInicio;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="tipo", columnDefinition="enum('Ativo', 'Inativo')")
	private StatusAtivacao statusMatricula;
	
	public Matricula(Aluno aluno, Curso curso, Date dataInicio,StatusAtivacao statusMatricula) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.matricula = gerarMatricula();
		this.dataInicio = dataInicio;
		this.statusMatricula = statusMatricula;
	}
	
	public Matricula(){
		
	}
	
	public String gerarMatricula() {
		Calendar cal = Calendar.getInstance();
		String matriculaGerada;
		
		matriculaGerada = Integer.toString(cal.get(Calendar.DAY_OF_YEAR));
		matriculaGerada = matriculaGerada + this.getCurso().getCodigo();
		matriculaGerada = matriculaGerada + Integer.toString(this.getId());
		
		return matriculaGerada;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public List<HistoricoEscolar> getHistorico() {
		return historico;
	}

	public void setHistorico(List<HistoricoEscolar> historico) {
		this.historico = historico;
	}

	public List<DisciplinasPeriodoAtual> getDisciplinasPeriodoAtuals() {
		return disciplinasPeriodoAtuals;
	}

	public void setDisciplinasPeriodoAtuals(List<DisciplinasPeriodoAtual> disciplinasPeriodoAtuals) {
		this.disciplinasPeriodoAtuals = disciplinasPeriodoAtuals;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public StatusAtivacao getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(StatusAtivacao statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	
	
	
}
