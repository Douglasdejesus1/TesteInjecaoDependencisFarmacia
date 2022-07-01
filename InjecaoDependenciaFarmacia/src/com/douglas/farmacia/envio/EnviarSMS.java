package com.douglas.farmacia.envio;

import com.douglas.farmacia.model.Paciente;

public class EnviarSMS implements Enviar {

	@Override
	public void avisa(Paciente paciente, String mensagem) {
		System.out.printf("Paciente %s, telefone: %s ,%s\n",paciente.getNome(),paciente.getTelefone(),mensagem);
		
	}
	

}
