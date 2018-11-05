package controllers;

import interfaces.*;
import model.*;

public class ControllerDepartamento extends ControllerGenerico<Departamento> {
	private IRepDepartamento iRepDepartamento;
	
	public ControllerDepartamento(IRepDepartamento e) {
		super(e);
		this.iRepDepartamento = e;
	}
	
}
