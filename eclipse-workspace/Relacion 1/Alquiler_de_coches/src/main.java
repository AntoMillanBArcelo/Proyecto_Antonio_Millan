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
		String color = null;
		SimpleDateFormat f_alta;
		SimpleDateFormat f_baja;
		int kms; 
		String categoria;
		String Ubicaci�n;
		
		int autonomia;	//Veh�culos electricos
		int t_recarga;	//Veh�culos electricos
		
		int cilindrada;
		String carnet = null;
		
		menu.subrayaTexto("Alquiler de veh�culos");
		menu.escribeArray(opc);
		
		int opcion = sc.nextInt();
		
		//sadasdads
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
							opcion = sc.nextInt();
							
							
							if(opcion == 1) {
								System.out.println("Escribe la localidad de la oficina");
								String LocOfi = sc.nextLine();
								
								System.out.println("Escribe el codigo de la oficina");								
								String codOfi  = sc.nextLine();
								
								System.out.println("Descripci�n");
								String descOfi = sc.nextLine();
								
								System.out.println("aeropuerto");
								char aeroOfi = sc.next().charAt(0);
								
								Oficina o = new Oficina(codOfi, carnet, LocOfi, descOfi, aeroOfi);
								ofi[0]=o;
								
								for(int i = 0; i < ofi.length; i++) {
						            System.out.println(ofi[i]);
						        }
							}
							
							
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
