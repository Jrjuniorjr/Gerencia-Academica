package controllers;

import interfaces.IRepDisciplina;
import interfaces.IRepGenerico;
import model.*;

public class ControllerDisciplina extends ControllerGenerico<Disciplina>{
	private IRepDisciplina iRepDisciplina;
	
	public ControllerDisciplina(IRepDisciplina e) {
		super(e);
		this.iRepDisciplina = e;
	}

}
