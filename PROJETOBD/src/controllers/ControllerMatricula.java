package controllers;

import interfaces.*;
import model.*;
public class ControllerMatricula extends ControllerGenerico<Matricula>{
	private IRepMatricula iRepMatricula;
	
	public ControllerMatricula(IRepMatricula e) {
		super(e);
		this.iRepMatricula = e;
	}
}
