package com.douglas.farmacia.envio;

import com.douglas.farmacia.model.Paciente;

public class EnviarEmail implements Enviar {

	@Override
	public void avisa(Paciente paciente, String mensagem) {
		System.out.printf("Paciente %s, email: %s ,%s\n",paciente.getNome(),paciente.getEmail(),mensagem);
		
	}

}
