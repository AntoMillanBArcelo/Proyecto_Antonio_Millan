package vehículo;

import java.text.SimpleDateFormat;

public class v_electrico extends vehiculo{

	private int autonomia;
	private int t_recarga;
	
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
	 * @param autonomia
	 * @param t_recarga
	 */
	
	public v_electrico(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación, int autonomia, int t_recarga) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación);
		
		this.setAutonomia(autonomia);
		this.setT_recarga(t_recarga);
		// TODO Auto-generated constructor stub
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public int getT_recarga() {
		return t_recarga;
	}

	public void setT_recarga(int t_recarga) {
		this.t_recarga = t_recarga;
	}

	@Override
	public String toString() {
		return "v_electrico [autonomia=" + autonomia + ", t_recarga=" + t_recarga + "]";
	}

	
	

	
}
