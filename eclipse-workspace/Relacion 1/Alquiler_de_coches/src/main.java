import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import empresa.Oficina;
import menu.menu;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] menuEmple = {"1. Oficina", "2. Categor�a","3. Veh�culos","4. Empleados"};	//Array de elementos del men� como empleado
		String[] opc = {"1. Empleado", "2. Cliente"};	//Array del men� general
		String[] opcEmpre = {"1. Borrar", "2. Modificar", "3. Agregar"};	//Las opciones que tendr�n los empleados sobre la empres
		Oficina[] ofi = new Oficina[1];
		
		//PROPIEDADES VEH�CULOS
		String matricula;
		String marca;
		String modelo;
		String color;
		SimpleDateFormat f_alta;
		SimpleDateFormat f_baja;
		int kms; 
		String categoria;
		String Ubicaci�n;
		
		int autonomia;	//Veh�culos electricos
		int t_recarga;	//Veh�culos electricos
		
		int cilindrada;
		String carnet;
		
		menu.subrayaTexto("Alquiler de veh�culos");
		menu.escribeArray(opc);
		
		int opcion = sc.nextInt();
		
		
		switch (opcion) {
		case 1: {
			
				System.out.println("");
				System.out.println("");
				
				menu.subrayaTexto("Has iniciado sesi�n como empleado");
				menu.escribeArray(menuEmple);
				
				int opcEmple = sc.nextInt();
				
				/**
				 * Muestra las opciones que tiene el usuario que se ha registrado como miembro de la empresa
				 */
				
					switch (opcEmple) {
						case 1: {							
							System.out.println("");
							System.out.println("");							
							menu.subrayaTexto("�Qu� acci�n deseas realizar sobre las oficinas?");
							menu.escribeArray(opcEmpre);	
							break;
							
						
							
							
						}
						
						case 2:{							
							System.out.println("");
							System.out.println("");							
							menu.subrayaTexto("�Qu� acci�n deseas realizar?");
							menu.escribeArray(opcEmpre);
							break;
						}						
						case 3:{						
							System.out.println("");
							System.out.println("");						
							menu.subrayaTexto("�Qu� acci�n deseas realizar?");
							menu.escribeArray(opcEmpre);
							break;
						}
						case 4:{	
							System.out.println("");
							System.out.println("");
							menu.subrayaTexto("�Qu� acci�n deseas realizar?");
							menu.escribeArray(opcEmpre);
							break;
						}
						
					}
					
					
			}
			
			case 2:{
				
				/**
				 * Menu como cliente
				 */
				
				System.out.println("2");
			}
		
		
		
	}

		
		
		
		
		}
}
