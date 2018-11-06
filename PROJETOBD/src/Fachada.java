import controllers.*;
import dadosjdbc.*;
import model.*;

public class Fachada {
	private static Fachada instancia;
	private ControllerProfessor controllerProfessor;

	private Fachada() {
		this.controllerProfessor = new ControllerProfessor(new JDBCRepositoryProfessor());
	}

	public static Fachada getInstance() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}
	
	// OPERAÇÕES DE PROFESSOR
	public void inserirProfessor(Professor p) throws Exception {
		this.controllerProfessor.inserir(p);
	}

	public void removerProfessor(Professor p) throws Exception {
		this.controllerProfessor.remover(p);
	}

	public Professor consultarProfessor(String key) throws Exception {
		return this.controllerProfessor.consultar(key);
	}

	public void atualizarConta(Professor p) throws Exception {
		this.controllerProfessor.atualizar(p);
	}

}
