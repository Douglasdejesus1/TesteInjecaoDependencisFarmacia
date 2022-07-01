package com.douglas.farmacia.service;

import com.douglas.farmacia.envio.Enviar;
import com.douglas.farmacia.model.Paciente;
import com.douglas.farmacia.model.Remedio;

public class NotaFiscalService {
	
	Enviar enviar;

	public NotaFiscalService(Enviar enviar) {
		super();
		this.enviar = enviar;
	}

	public Enviar getEnviar() {
		return enviar;
	}

 public void nota(Paciente cliente, Remedio remedio) {
	 
	 enviar.avisa(cliente, "Nota Fiscal emitida, Medicamento: "+remedio.getNome()+", Fabricante: "
	 +remedio.getFabricante()+", valor total: R$"+remedio.getValor()+".");
	 
 }
	
	

}
