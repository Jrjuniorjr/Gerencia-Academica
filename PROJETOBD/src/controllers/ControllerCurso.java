package controllers;

import interfaces.*;
import model.*;
public class ControllerCurso extends ControllerGenerico<Curso>{
	private IRepCurso iRepCurso;
	public ControllerCurso(IRepCurso e) {
		super(e);
		this.iRepCurso = e;
	}
	
}
