package controllers;

import model.*;
import interfaces.IRepDisciplinasPeriodoAtual;
import model.DisciplinasPeriodoAtual;

public class ControllerDisciplinasPeriodoAtual{
	private IRepDisciplinasPeriodoAtual iRepDisciplinasPeriodoAtual;
	
	public ControllerDisciplinasPeriodoAtual(IRepDisciplinasPeriodoAtual e){
		this.iRepDisciplinasPeriodoAtual = e; 
	}
	
	public void inserir(DisciplinasPeriodoAtual disciplinasPeriodoAtual){
		iRepDisciplinasPeriodoAtual.inserir(disciplinasPeriodoAtual);
	}
	public void atualizar(DisciplinasPeriodoAtual disciplinasPeriodoAtual){
		iRepDisciplinasPeriodoAtual.atualizar(disciplinasPeriodoAtual);
	}
	public void remover(DisciplinasPeriodoAtual disciplinasPeriodoAtual){
		iRepDisciplinasPeriodoAtual.remover(disciplinasPeriodoAtual);
	}
	
	public DisciplinasPeriodoAtual procurarPorId(int id){
		return iRepDisciplinasPeriodoAtual.procurarPorId(id);
	}
	public DisciplinasPeriodoAtual procurarPorMatricula(Matricula matricula){
		return iRepDisciplinasPeriodoAtual.procurarPorMatricula(matricula);
	}
	public DisciplinasPeriodoAtual procurarPorDisciplina(Disciplina disciplina){
		return iRepDisciplinasPeriodoAtual.procurarPorDisciplina(disciplina);
	}
}
