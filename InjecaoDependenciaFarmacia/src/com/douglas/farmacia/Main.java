package com.douglas.farmacia;

import com.douglas.farmacia.envio.Enviar;
import com.douglas.farmacia.envio.EnviarEmail;
import com.douglas.farmacia.envio.EnviarSMS;
import com.douglas.farmacia.model.Paciente;
import com.douglas.farmacia.model.Remedio;
import com.douglas.farmacia.service.AtivarClienteService;
import com.douglas.farmacia.service.NotaFiscalService;

public class Main {

	public static void main(String[] args) {

		Paciente paciente = new Paciente("Douglas","11954544","douglas@gmail.com");
		
		Enviar envioEMAIL = new EnviarEmail();
		Enviar envioSMS = new EnviarSMS();
		AtivarClienteService ativarComEmail= new AtivarClienteService(envioEMAIL);
		Remedio remedio = new Remedio("Budesonida", "EMS", 123.33);
		ativarComEmail.ativar(paciente);
		
		NotaFiscalService nota = new NotaFiscalService(envioSMS);
		nota.nota(paciente, remedio);
	}

}
