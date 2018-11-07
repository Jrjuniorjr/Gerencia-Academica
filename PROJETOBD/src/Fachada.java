import controllers.*;
import dadoshibernate.*;
import dadosjdbc.*;
import model.*;

public class Fachada {
	private static Fachada instancia;
	private ControllerProfessor controllerProfessor;
	private ControllerDepartamento controllerDepartamento;
	private ControllerCurso controllerCurso;
	
	private Fachada() {
		this.controllerProfessor = new ControllerProfessor(new HibernateRepositoryProfessor());
		this.controllerDepartamento = new ControllerDepartamento(new HibernateRepositoryDepartamento());
		this.controllerCurso = new ControllerCurso(new HibernateRepositoryCurso());
	}

	public static Fachada getInstance() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
	
	// OPERAÇÕES DE PROFESSOR
	public void inserirProfessor(Professor professor) throws Exception {
		this.controllerProfessor.inserir(professor);
	}

	public void removerProfessor(Professor professor) throws Exception {
		this.controllerProfessor.remover(professor);
	}

	public Professor consultarProfessor(String key) throws Exception {
		return this.controllerProfessor.consultar(key);
	}

	public void atualizarProfessor(Professor professor) throws Exception {
		this.controllerProfessor.atualizar(professor);
	}
	
	// OPERAÇÕES DE Departamento
	public void inserirDepartamento(Departamento departamento) throws Exception {
		this.controllerDepartamento.inserir(departamento);
	}

	public void removerDepartamento(Departamento departamento) throws Exception {
		this.controllerDepartamento.remover(departamento);
	}

	public Departamento consultarDepartamento(String key) throws Exception {
		return this.controllerDepartamento.consultar(key);
	}

	public void atualizarDepartamento(Departamento departamento) throws Exception {
		this.controllerDepartamento.atualizar(departamento);
	}
	

	// OPERAÇÕES DE Curso
	public void inserirCurso(Curso curso) throws Exception {
		this.controllerCurso.inserir(curso);
	}

	public void removerCurso(Curso curso) throws Exception {
		this.controllerCurso.remover(curso);
	}

	public Curso consultarCurso(String key) throws Exception {
		return this.controllerCurso.consultar(key);
	}

	public void atualizarCurso(Curso curso) throws Exception {
		this.controllerCurso.atualizar(curso);
	}

}
