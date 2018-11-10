package model;
import javax.persistence.*;

@Entity
@Table(name="Aluno_Endereco")
public class Endereco {
	
	@Id 
	@Column (name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="cpf")
	private String alunoCpf;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="bairro")
	private String bairro;

	
	public Endereco(int id, String alunoCpf, String cep, String rua, String bairro) {
		super();
		this.id = id;
		this.alunoCpf = alunoCpf;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
	}

	public Endereco() {
		
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlunoCpf() {
		return alunoCpf;
	}

	public void setAlunoCpf(String alunoCpf) {
		this.alunoCpf = alunoCpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	
}
