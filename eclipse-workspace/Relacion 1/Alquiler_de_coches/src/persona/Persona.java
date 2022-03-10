package persona;

/**
 * 
 * 
 * 
 * 
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import letraDNI.Letra_DNI;
import validaDNI.validar_dni;


public abstract class Persona {

	private String nombre;
	private String ape1;
	private String ape2;
	private String dni;
	
	/**
	 * @param nombre
	 * @param ape1
	 * @param ape2
	 * @param dni
	 * @return 
	 */
	
	
	public Persona(String nombre, String ape1, String ape2, String dni) {
		super();
		this.setNombre(nombre); 
		this.setApe1(ape1);
		this.setApe2(ape2);
		this.setDni(dni);
	}
	
	//Este constructor no pide el segundo apellido
	public Persona(String nombre, String ape1, String dni) {
		super();
		this.setNombre(nombre); 
		this.setApe1(ape1);
		this.setDni(dni);
	}
	
	//Copia
	public Persona(Persona p) {
		this.dni = p.getDni();
		this.nombre = p.getNombre();
		this.ape1 = p.getApe1();
		this.ape2 = p.getApe2();
	}

	//Get && Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		try {
			this.nombre = nombre;
		} catch (Exception e) {
			System.out.println("");
		}
		
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
	
		
			this.dni = dni;
		
	}

	
	//Metodos
	@Override
	public String toString() {
		return  nombre + " " + ape1 + ", su DNI "+ dni;
	}
	
	public String nombreCompleto() {
		String nCompleto;
		nCompleto = nombre + " " + ape1 + " " + ape2;	
		return nCompleto;
	}
	
	
	public int compareTo(Object o){

		Persona p = (Persona) o;	

		return this.nombreCompleto().compareToIgnoreCase(p.nombreCompleto());

	}
	
	
	
	
	
	
	
	
}
