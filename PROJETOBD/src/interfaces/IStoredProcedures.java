package interfaces;

import model.*;

public interface IStoredProcedures {
	public void makeAtaPresenca(Disciplina disciplina);
	public void alterarNotaManeiraSegura(DisciplinasPeriodoAtual disciplinasPeriodoAtual);
	public void demitirProfessor(Professor professor);
	public void inserirDisciplinaObrigatoriaRecalcularCreditosCurso(Disciplina disciplina, Curso curso);
	public void cursandoParaHistorico();
	
}
