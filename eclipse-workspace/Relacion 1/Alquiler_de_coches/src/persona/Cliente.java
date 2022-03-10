package persona;

/**
 * 
 * 
 * 
 * 
 */

import java.util.ArrayList;
public class Cliente extends Persona{
	
	private String tipoCarnet;
	private int numTarjeta;

	public Cliente(String nombre, String ape1, String dni) {
		super(nombre, ape1, dni);
		// TODO Auto-generated constructor stub
		this.setNumTarjeta(numTarjeta);;
		this.setTipoCarnet(tipoCarnet);;
		
	}

	//Constructor completo
	public Cliente(String nombre, String ape1, String ape2, String dni, String tipoCarnet, int numTarjeta) {
		super(nombre, ape1, ape2, dni);
		// TODO Auto-generated constructor stub
		this.numTarjeta = numTarjeta;
		this.tipoCarnet = tipoCarnet;
		
	}
	
	//Get && Set
	public String getTipoCarnet() {
		return tipoCarnet;
	}

	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}



	@Override
	public String toString() {
		return "El cliente " + getNombre()+ getApe1()+ getApe2()+ " tiene un carnet " + tipoCarnet + ", y su número de tarjeta es " + numTarjeta;
	}
	
	public String datosCliente() {
		String datosC;
		datosC = "El cliente " + getDni()+ " tiene un carnet " + tipoCarnet + ", y su número de tarjeta es " + numTarjeta;
		return datosC;
	}
	
	

	

}
