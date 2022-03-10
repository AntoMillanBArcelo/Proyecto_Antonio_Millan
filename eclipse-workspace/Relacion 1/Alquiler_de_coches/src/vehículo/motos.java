package vehículo;

import java.text.SimpleDateFormat;
/**
 * 
 * @author Antonio Millán
 *
 */
public class motos extends v_electrico{
	private int cilindrada;
	private String carnet;
	
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
	 * @param cilindrada
	 * @param carnet
	 */
	
	public motos(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta,
			SimpleDateFormat f_baja, int kms, String categoria, String ubicación, int autonomia, int t_recarga, int cilindrada, String carnet) {
		super(matricula, marca, modelo, color, f_alta, f_baja, kms, categoria, ubicación, autonomia, t_recarga);
		// TODO Auto-generated constructor stub
		
		this.setCilindrada(cilindrada);
		this.setCarnet(carnet);
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		if(carnet.equals("AM")||  carnet.equals("A1") ||carnet.equals("A2")) {
			this.carnet = carnet;
		}
	}

	//metodos
	@Override
	public String toString() {
		return "La moto: "+getModelo() +" "+ getColor() +" "+getMarca()+" "+ getKms()+"kms";
	}
	
	public String datosDetallados() {
		return "La moto: "+getModelo() +" "+ getCarnet() +" "+getCilindrada()+" "+ getKms()+"kms";
	}
	
	


}
