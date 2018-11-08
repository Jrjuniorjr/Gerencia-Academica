package controllers;

import interfaces.IRepDisciplinasPeriodoAtual;
import model.DisciplinasPeriodoAtual;

public class ControllerDisciplinasPeriodoAtual extends ControllerGenerico<DisciplinasPeriodoAtual>{
	private IRepDisciplinasPeriodoAtual iRepDisciplinasPeriodoAtual;
	
	public ControllerDisciplinasPeriodoAtual(IRepDisciplinasPeriodoAtual e){
		super(e);
		
	}

}
