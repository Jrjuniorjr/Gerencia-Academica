package controllers;

import interfaces.*;
import model.*;

public class ControllerAluno extends ControllerGenerico<Aluno>{
	private IRepAluno iRepAluno;
	public ControllerAluno(IRepAluno e) {
		super(e);
		this.iRepAluno= e;
	}
}
