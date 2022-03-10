package vehículo;

import java.text.SimpleDateFormat;
/**
 * 
 * @author Antonio Millán
 *
 */
public class cocheElec extends v_electrico{
	
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
	 * @param autonomia
	 * @param t_recarga
	 * @param tipo
	 * @param numPlazas
	 */
	
	public cocheElec(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación, int autonomia, int t_recarga,String tipo,int numPlazas) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación, autonomia, t_recarga);
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
		this.tipo = tipo;
	}

	//metodos
	@Override
	public String toString() {
		return "cocheElec "+getModelo()+" "+ getTipo()+" "+numPlazas;
	}
	
	public String datosDetallados() {
		return getMarca()+" "+getModelo()+" "+getTipo()+" "+getKms();
	}
	
	
	
	
	

}
