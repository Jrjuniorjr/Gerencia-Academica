package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Aluno")
public class Aluno {
	@Id 
	@Column (name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
	private String sobrenome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Tipo", columnDefinition="enum('Vestibular','Transferencia')")
	private TipoAlunoEnum tipoAluno;
	
	@Column(name="data_nascimento")
	private Date dataNascimento;
	
	@OneToOne(cascade=
	CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Endereco endereco;
	
	
	@OneToMany(
			mappedBy="aluno",
			fetch = FetchType.LAZY
	)
	private List<Matricula> matriculas = new ArrayList<>();
	
	
	public Aluno(int id, String cpf, String nome,
			String sobrenome, TipoAlunoEnum tipoAluno,
			Date dataNascimento, Endereco endereco) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tipoAluno = tipoAluno;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		//this.matriculas = new ArrayList<>();
	}
	
	public Aluno(){
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public TipoAlunoEnum getTipoAluno() {
		return this.tipoAluno;
	}
	public void setTipoAluno(TipoAlunoEnum tipoAluno) {
		this.tipoAluno = tipoAluno;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	
}
