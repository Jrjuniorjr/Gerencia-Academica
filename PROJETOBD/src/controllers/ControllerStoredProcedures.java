package controllers;

import interfaces.IRepDisciplinasPeriodoAtual;
import interfaces.IStoredProcedures;
import model.*;

public class ControllerStoredProcedures {
	private IStoredProcedures iStoredProcedures;

	public ControllerStoredProcedures(IStoredProcedures iStoredProcedures) {
		super();
		this.iStoredProcedures = iStoredProcedures;
	}
	
	public void makeAtaPresenca(Disciplina disciplina){
		iStoredProcedures.makeAtaPresenca(disciplina);
	}
	public void alterarNotaManeiraSegura(DisciplinasPeriodoAtual disciplinasPeriodoAtual){
		iStoredProcedures.alterarNotaManeiraSegura(disciplinasPeriodoAtual);
	}
	
	public void demitirProfessor(Professor professor){
		iStoredProcedures.demitirProfessor(professor);
	}
	
	public void inserirDisciplinaObrigatoriaRecalcularCreditosCurso(Disciplina disciplina, Curso curso){
		iStoredProcedures.inserirDisciplinaObrigatoriaRecalcularCreditosCurso(disciplina, curso);
	}
	public void cursandoParaHistorico(){
		iStoredProcedures.cursandoParaHistorico();
	}
}
