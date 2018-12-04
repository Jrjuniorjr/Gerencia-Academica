package interfaces;

import model.*;

public interface IRepDisciplinasPeriodoAtual{
	public void inserir(DisciplinasPeriodoAtual disciplinasPeriodoAtual);
	public void atualizar(DisciplinasPeriodoAtual disciplinasPeriodoAtual);
	public void remover(DisciplinasPeriodoAtual disciplinasPeriodoAtual);
	
	public DisciplinasPeriodoAtual procurarPorId(int id);
	public DisciplinasPeriodoAtual procurarPorMatricula(Matricula matricula);
	public DisciplinasPeriodoAtual procurarPorDisciplina(Disciplina disciplina);
}
