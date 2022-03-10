package persona;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 */



import java.sql.Date;

import empresa.Empresa;

public class Empleado extends Persona{

	private Date f_alta;
	private String oficina;
	
	/**
	 * 
	 * @param nombre
	 * @param ape1
	 * @param dni
	 */
	public Empleado(String nombre, String ape1, String dni) {
		super(nombre, ape1, dni);
		// TODO Auto-generated constructor stub
		this.f_alta = f_alta;
		this.oficina = oficina;
	}
	
	//Constructor completo
	public Empleado(String nombre, String ape1, String ape2, String dni, String oficina,Date f_alta) {
		super(nombre, ape1, ape2, dni);
		this.f_alta = f_alta;
		this.oficina = oficina;
	}

	//Get && Set
	public Date getF_alta() {
		return f_alta;
	}


	public void setF_alta(Date f_alta) {
		this.f_alta = f_alta;
	}


	public String getOficina() {
		return oficina;
	}


	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return "El empleado " + getNombre() + " tiene de alta " + f_alta + " y su oficina es " + oficina; 
	}
	public String nombreCompleto() {
		return getNombre() + " "+ getApe1()+ " " + getApe2();
				
	}
	
	
	
	
	
	
	
}
