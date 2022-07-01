package com.douglas.farmacia.envio;

import com.douglas.farmacia.model.Paciente;

public interface Enviar {
	
	void avisa(Paciente paciente, String mensagem);

}