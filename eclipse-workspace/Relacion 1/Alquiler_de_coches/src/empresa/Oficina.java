package empresa;

import java.util.TreeMap;

public class Oficina {
	
	public static TreeMap tm = new TreeMap();
	
	private String cod;
	private String descripcion;
	private String localidad;
	private String provincia;
	private char ofiAeropuerto;
	
	/**
	 * 
	 * @param cod
	 * @param descripcion
	 * @param localidad
	 * @param provincia
	 * @param string
	 */

	public Oficina(String cod, String descripcion, String localidad, String provincia, char ofiAeropuerto) {
		super();
		this.cod = cod;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.ofiAeropuerto = ofiAeropuerto;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public char getOfiAeropuerto() {
		return ofiAeropuerto;
	}

	public void setOfiAeropuerto(char ofiAeropuerto) {
		if(ofiAeropuerto=='s' || ofiAeropuerto=='n') {
			this.ofiAeropuerto = ofiAeropuerto;
		}
	}

	@Override
	public String toString() {
		return "Oficina [cod=" + cod + ", descripcion=" + descripcion + ", localidad=" + localidad + ", provincia="
				+ provincia + ", ofiAeropuerto=" + ofiAeropuerto + "]";
	}

	
	
	

	

}
