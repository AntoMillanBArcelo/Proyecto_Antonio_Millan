package vehículo;

import java.text.SimpleDateFormat;

public class cocheCombu extends v_combustion{
	
	private int numPlazas;
	private String tipo;
	
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
	
	//Constructor
	
	public cocheCombu(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación, int numPlazas, String tipo) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación);
		// TODO Auto-generated constructor stub
		
		this.setNumPlazas(numPlazas);
		this.setTipo(tipo);
	}

	
	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo.equals("deportivo")||  tipo.equals("familiar") ||tipo.equals("4x4")) {
			this.tipo = tipo;
		}
		
	}


	@Override
	public String toString() {
		return "cocheCombu [numPlazas=" + numPlazas + ", tipo=" + tipo + "]";
	}
	
	
	
	
	

}
