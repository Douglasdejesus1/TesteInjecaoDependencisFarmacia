package com.douglas.farmacia.model;

public class Paciente {
	
	private String nome;
	private String telefone;
	private String email;
	private boolean ativar;
	public Paciente(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public boolean isAtivar() {
		return ativar;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	
	public void ativar() {
		this.ativar=true;
	}

}
