package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.util.utiles;
import app.curso.banco.entidad.*;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Gestor> listasGestores = new HashMap<>();

		HashMap<Integer, Cliente> listasClientes = new HashMap<>();

		//commit3
		Scanner keyboard = new Scanner(System.in);
		
		Gestor g1 = null;
		Gestor Gestor1 = null;
		Integer numero1 = null;

		
		
		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear Gestor");
			System.out.println("2. Insercion masiva de gestores con datos aleatorios");
			System.out.println("3. Obtención de un Gestor");
			System.out.println("4. Ver todos Gestores");
			System.out.println("5. Actualiza Gestor");
			System.out.println("0. Salir\n");
			System.out.print("Opción: ");
			menuSeleccionado = keyboard.nextInt();

			switch (menuSeleccionado) {
			// salir
			case 0:
				System.out.println("Saliendo...");
				break;
			// crear un nuevo estudiante pidiendo los datos por teclado
			case 1:
				System.out.println("Creando gestor:");

				System.out.println("--------------------------------------------");

				System.out.println("Id del gestor:");

				int idNuevo = keyboard.nextInt();

				System.out.println("--------------------------------------------");

				System.out.println("nombre del gestor:");

				String nombre = keyboard.next();

				System.out.println("--------------------------------------------");

				System.out.println("numero de telefono:");

				String numeroTlfn = keyboard.next();

				System.out.println("--------------------------------------------");

				System.out.println("numero de de id de oficina");

				int idOficina = keyboard.nextInt();
				System.out.println("--------------------------------------------");

				 g1 = new Gestor(idNuevo, nombre, numeroTlfn, idOficina);

				listasGestores.put(g1.getId(), g1);

				System.out.println("SE HA CREADO UN NUEVO GESTOR");

				System.out.println("--------------------------------------------");

				break;
			
			case 2:
				System.out.println("--------------------------------------------");

				//colocan gestores de forma masiva
				
				int i ;
				
				String nombreLlamado = null;
				
				String telefonoLlamado =null ;
				
				int idOficinaLlamado = 0;
				
				for( i = 0; i < 10 ; i++) {
					
					
					System.out.println("Id del Gestor :"+ " " + i);

					
					nombreLlamado = utiles.nombreAleatorio();
					
					//int idLlamado = utiles.idAleatorio();
					
					telefonoLlamado = utiles.telefonoAleatorio();
					
					
					 idOficinaLlamado = utiles.idOficinaAleatorio();
					
					
						Gestor1 = new Gestor (i, nombreLlamado, telefonoLlamado,idOficinaLlamado);
						
						listasGestores.put(Gestor1.getId(), Gestor1);
						
					
					System.out.println("--------------------------------------------");
					
				
				}
				
			
			
				break;
			// Obteniendo un gestor
			case 3:

				
				
				System.out.println("coloca un numero de 0 al 9 para obtener un gestor");
				
				System.out.println("--------------------------------------------");
				
				int numero = keyboard.nextInt();
				
				
				 
				
				System.out.println(listasGestores.get(numero));

				
				
				//g1.mostrarInfo();
				
				//System.out.println(listasGestores.get(numero));
				
			
				
				
				
				
				
				
				
				
				
				break;
			
			case 4:
				System.out.println("Obteniedno todos los Gestores");
				
				System.out.println("--------------------------------------------");
			
				listasGestores.forEach((id, gestor) -> {
					gestor.mostrarInfo();

				});
				break;
			case 5:
				System.out.println("Actualiza el ID del gestor:");
				int actualizaGestorId = keyboard.nextInt();
				//g1.actualizarPersona(actualizaGestorId);*/
				
				/*listasGestores.forEach((id, gestor) -> {
					gestor.actualizarPersona(actualizaGestorId);

				});*/
				
				listasGestores.forEach((id, gestor) -> {
					gestor.actualizarPersona(actualizaGestorId);

				});
				
			System.out.println("Id actualizado");
				
				break;
			default:
				System.out.println("Opción desconocida...");
				break;
			}

		} while (menuSeleccionado != 0);

	}

	private static String nombreAleatorio(String[] nombres) {
		// TODO Auto-generated method stub
		return null;
	}
}
