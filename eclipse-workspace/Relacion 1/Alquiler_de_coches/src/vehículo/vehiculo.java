package vehículo;

/**
 * 
 * 
 * 
 */
import java.text.SimpleDateFormat;

/**
 * 
 * @author Antonio Millán
 *
 */
public abstract class vehiculo {
	//Formato de la fecha
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private SimpleDateFormat f_alta;
	private SimpleDateFormat f_baja;
	private int kms; 
	private String categoria;
	private String Ubicación;
	
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
	public vehiculo(String matricula, String marca, String modelo, String color, SimpleDateFormat f_alta, SimpleDateFormat f_baja, int kms,
			String categoria, String ubicación) {
		super();
		this.setMatricula(matricula);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setColor(color); 
		this.setF_alta(f_alta);
		this.setF_baja(f_baja);
		this.setKms(kms);
		this.setCategoria(categoria);
		Ubicación = ubicación;
	}

	/**
	 * 
	 * 
	 * @return
	 */
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public SimpleDateFormat getF_alta() {
		return f_alta;
	}

	public void setF_alta(SimpleDateFormat f_alta) {
		this.f_alta = f_alta;
	}

	public SimpleDateFormat getF_baja() {
		return f_baja;
	}

	public void setF_baja(SimpleDateFormat f_baja) {
		this.f_baja = f_baja;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getUbicación() {
		return Ubicación;
	}

	public void setUbicación(String ubicación) {
		Ubicación = ubicación;
	}
	
	

	
	

	

}
