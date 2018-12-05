package interfaces;

import model.*;

public interface IRepHistoricoEscolar{
	public HistoricoEscolar procurarPorId(int id);
	public HistoricoEscolar procurarPorMatricula(Matricula matricula);
	public HistoricoEscolar procurarPorDisciplina(Disciplina disciplina);
}
