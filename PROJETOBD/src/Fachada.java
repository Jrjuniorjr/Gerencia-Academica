import controllers.*;
import dadoshibernate.*;
import dadosjdbc.*;
import model.*;
import storedprocedures.JDBCStoredProcedures;

public class Fachada {
	private static Fachada instancia;
	private ControllerProfessor controllerProfessor;
	private ControllerDepartamento controllerDepartamento;
	private ControllerCurso controllerCurso;
	private ControllerDisciplina controllerDisciplina;
	private ControllerAluno controllerAluno;
	private ControllerMatricula controllerMatricula;
	private ControllerHistoricoEscolar controllerHistoricoEscolar;
	private ControllerDisciplinasPeriodoAtual controllerDisciplinasPeriodoAtual;
	private ControllerStoredProcedures controllerStoredProcedures;

	private Fachada() {
		this.controllerProfessor = new ControllerProfessor(new HibernateRepositoryProfessor());
		this.controllerDepartamento = new ControllerDepartamento(new HibernateRepositoryDepartamento());
		this.controllerCurso = new ControllerCurso(new HibernateRepositoryCurso());
		this.controllerDisciplina = new ControllerDisciplina(new HibernateRepositoryDisciplina());
		this.controllerAluno = new ControllerAluno(new HibernateRepositoryAluno());
		this.controllerMatricula = new ControllerMatricula(new HibernateRepositoryMatricula());
		this.controllerHistoricoEscolar = new ControllerHistoricoEscolar(new HibernateRepositoryHistoricoEscolar());
		this.controllerDisciplinasPeriodoAtual = new ControllerDisciplinasPeriodoAtual(new HibernateRepositoryDisciplinasPeriodoAtual());
		this.controllerStoredProcedures = new ControllerStoredProcedures(new JDBCStoredProcedures());
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

	// OPERAÇÕES DE ALUNO
	public void inserirAluno(Aluno aluno) throws Exception {
		this.controllerAluno.inserir(aluno);
	}

	public void removerAluno(Aluno aluno) throws Exception {
		this.controllerAluno.remover(aluno);
	}

	public Aluno consultarAluno(String key) throws Exception {
		return this.controllerAluno.consultar(key);
	}

	public void atualizarAluno(Aluno aluno) throws Exception {
		this.controllerAluno.atualizar(aluno);
	}

	// OPERAÇÕES DE Disciplina
	public void inserirDisciplina(Disciplina disciplina) throws Exception {
		this.controllerDisciplina.inserir(disciplina);
	}

	public void removerDisciplina(Disciplina disciplina) throws Exception {
		this.controllerDisciplina.remover(disciplina);
	}

	public Disciplina consultarDisciplina(String key) throws Exception {
		return this.controllerDisciplina.consultar(key);
	}

	public void atualizarDisciplina(Disciplina disciplina) throws Exception {
		this.controllerDisciplina.atualizar(disciplina);
	}

	// OPERAÇÕES DE MATRICULA
	public void inserirMatricula(Matricula matricula) throws Exception {
		this.controllerMatricula.inserir(matricula);
	}

	public void removerMatricula(Matricula matricula) throws Exception {
		this.controllerMatricula.remover(matricula);
	}

	public Matricula consultarMatricula(String key) throws Exception {
		return this.controllerMatricula.consultar(key);
	}

	public void atualizarMatricula(Matricula matricula) throws Exception {
		this.controllerMatricula.atualizar(matricula);
	}

	// OPERAÇÕES DE HISTORICO ESCOLAR

	public HistoricoEscolar consultarHistoricoEscolarPorId(int id) throws Exception {
		return this.controllerHistoricoEscolar.procurarPorId(id);
	}
	
	public HistoricoEscolar consultarHistoricoEscolarPorMatricula(Matricula matricula) throws Exception {
		return this.controllerHistoricoEscolar.procurarPorMatricula(matricula);
	}

	public HistoricoEscolar consultarHistoricoEscolarPorDisciplina(Disciplina disciplina) throws Exception {
		return this.controllerHistoricoEscolar.procurarPorDisciplina(disciplina);
	}


	// OPERAÇÕES DE DISCIPLINAS DO PERIODO ATUAL
	public void inserirDisciplinasPeriodoAtual(DisciplinasPeriodoAtual disciplinasPeriodoAtual) throws Exception {
		this.controllerDisciplinasPeriodoAtual.inserir(disciplinasPeriodoAtual);
	}

	public void removerDisciplinasPeriodoAtual(DisciplinasPeriodoAtual disciplinasPeriodoAtual) throws Exception {
		this.controllerDisciplinasPeriodoAtual.remover(disciplinasPeriodoAtual);
	}

	public DisciplinasPeriodoAtual consultarDisciplinasPeriodoAtualPorId(int id) throws Exception {
		return this.controllerDisciplinasPeriodoAtual.procurarPorId(id);
	}

	public DisciplinasPeriodoAtual consultarDisciplinasPeriodoAtualPorMatricula(Matricula matricula) throws Exception {
		return this.controllerDisciplinasPeriodoAtual.procurarPorMatricula(matricula);
	}
	
	public DisciplinasPeriodoAtual consultarDisciplinasPeriodoAtualPorDisciplina(Disciplina disciplina) throws Exception {
		return this.controllerDisciplinasPeriodoAtual.procurarPorDisciplina(disciplina);
	}
	
	public void atualizarDisciplinasPeriodoAtual(DisciplinasPeriodoAtual disciplinasPeriodoAtual) throws Exception {
		this.controllerDisciplinasPeriodoAtual.atualizar(disciplinasPeriodoAtual);
	}
	
	//PROCEDURES
	public void makeAtaPresenca(Disciplina disciplina){
		this.controllerStoredProcedures.makeAtaPresenca(disciplina);
	}
	public void alterarNotaManeiraSegura(DisciplinasPeriodoAtual disciplinasPeriodoAtual){
		this.controllerStoredProcedures.alterarNotaManeiraSegura(disciplinasPeriodoAtual);
	}

	public void demitirProfessor(Professor professor){
		this.controllerStoredProcedures.demitirProfessor(professor);
	}
	public void inserirDisciplinaObrigatoriaRecalcularCreditosCurso(Disciplina disciplina, Curso curso){
		this.controllerStoredProcedures.inserirDisciplinaObrigatoriaRecalcularCreditosCurso(disciplina, curso);
	}
	public void cursandoParaHistorico(){
		this.controllerStoredProcedures.cursandoParaHistorico();
	}

}
