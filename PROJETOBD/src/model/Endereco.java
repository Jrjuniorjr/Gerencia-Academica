package model;
import javax.persistence.*;

@Entity
@Table(name="Aluno_Endereco")
public class Endereco {
	
	@Id 
	@Column (name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//OBSERVAÇÃO
	@Column(name="cpfAluno")
	private String cpfAluno;
	//private int idAluno;
	
	@Column(name="CEP")
	private String cep;
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="bairro")
	private String bairro;

	
	public Endereco(String cpfAluno, String cep, String rua, String bairro) {
		super();
		this.cpfAluno = cpfAluno;
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



	/*public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}*/

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
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
