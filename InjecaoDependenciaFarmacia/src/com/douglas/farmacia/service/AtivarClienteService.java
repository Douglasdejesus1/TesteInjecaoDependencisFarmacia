package com.douglas.farmacia.service;

import com.douglas.farmacia.envio.Enviar;
import com.douglas.farmacia.model.Paciente;

public class AtivarClienteService {
	
	Enviar enviar;
	
	
	public AtivarClienteService(Enviar enviar) {
		super();
		this.enviar = enviar;
	}


	public Enviar getEnviar() {
		return enviar;
	}


	public void ativar(Paciente paciente) {
		paciente.ativar();
		
		enviar.avisa(paciente, "Seu perfil esta ativo.");
		
	}
	

}
