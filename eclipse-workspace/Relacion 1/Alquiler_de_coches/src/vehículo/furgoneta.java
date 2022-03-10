package vehículo;

import java.text.SimpleDateFormat;

public class furgoneta extends v_combustion {
	
	private int carga;
	private char carnet;
	
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
	
	public furgoneta(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación, int carga, char carnet) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación);
		// TODO Auto-generated constructor stub
		
		this.setCarga(carga);
		this.setCarnet(carnet);
		
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public char getCarnet() {
		return carnet;
	}

	public void setCarnet(char carnet) {
		if(carnet == 'B'|| carnet == 'C' || carnet == 'D'){
			this.carnet = carnet;
		}
	}

	
	//matodos
	@Override
	public String toString() {
		return "furgoneta [carga=" + carga + ", carnet=" + carnet + "]";
	}
	
}
