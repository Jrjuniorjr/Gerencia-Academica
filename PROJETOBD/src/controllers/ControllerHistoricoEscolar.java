package controllers;

import model.*;
import interfaces.*;

public class ControllerHistoricoEscolar extends ControllerGenerico<HistoricoEscolar>{
	private IRepHistoricoEscolar iRepHistoricoEscolar;
	
	public ControllerHistoricoEscolar(IRepHistoricoEscolar e) {
		super(e);
		this.iRepHistoricoEscolar = e;
	}
}
