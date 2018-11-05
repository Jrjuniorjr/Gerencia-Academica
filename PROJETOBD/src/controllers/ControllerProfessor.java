package controllers;

import interfaces.*;
import model.Professor;

public class ControllerProfessor extends ControllerGenerico<Professor>{
	private IRepProfessor repository;
	public ControllerProfessor(IRepProfessor iRepProfessor) {
		super(iRepProfessor);
		this.repository = iRepProfessor;
	}
	
}
