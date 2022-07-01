package com.douglas.farmacia.model;

public class Remedio {
	private String nome;
	private String fabricante;
	private double valor;
	public Remedio(String nome, String fabricante, double valor) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public double getValor() {
		return valor;
	}
	
	

}
