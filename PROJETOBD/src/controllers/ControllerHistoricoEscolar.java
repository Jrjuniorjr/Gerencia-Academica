package controllers;

import model.*;
import interfaces.*;

public class ControllerHistoricoEscolar{
	private IRepHistoricoEscolar iRepHistoricoEscolar;
	
	public ControllerHistoricoEscolar(IRepHistoricoEscolar e) {
		this.iRepHistoricoEscolar = e;
	}
	

	public HistoricoEscolar procurarPorId(int id){
		return iRepHistoricoEscolar.procurarPorId(id);
	}
	public HistoricoEscolar procurarPorMatricula(Matricula matricula){
		return iRepHistoricoEscolar.procurarPorMatricula(matricula);
			
	}
	public HistoricoEscolar procurarPorDisciplina(Disciplina disciplina){
		return iRepHistoricoEscolar.procurarPorDisciplina(disciplina);
		
	}
}
