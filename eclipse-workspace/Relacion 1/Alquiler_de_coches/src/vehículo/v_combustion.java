package vehículo;

import java.text.SimpleDateFormat;

public class v_combustion extends vehiculo {

	private String consumo;
	private int potencia;
	private char emision;
	
	/**
	 * 
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param f_alta
	 * @param f_baja
	 * @param kms
	 * @param categoria
	 * @param ubicación
	 */
	
	public v_combustion(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación);
		// TODO Auto-generated constructor stub
		
		this.setConsumo(consumo);
		this.setPotencia(potencia);
		this.setEmision(emision);
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public char getEmision() {
		return emision;
	}

	public void setEmision(char emision) {
		this.emision = emision;
	}
	
	

}
