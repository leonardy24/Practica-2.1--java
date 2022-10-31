package app.curso.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.util.utiles;
import app.curso.banco.entidad.*;

public class ConsolaBanco {

	public static void main(String[] args) {

		HashMap<Integer, Gestor> listasGestores = new HashMap<>();

		HashMap<Integer, Cliente> listasClientes = new HashMap<>();

		// commit
		// commit2.2
///estudiando
		Scanner keyboard = new Scanner(System.in);

		Gestor Gestor1 = null;
		Integer numero1 = null;

		int menuSeleccionado = -1;

		do {
			System.out.println("1. Crear Gestor");
			System.out.println("2. Insercion masiva de gestores con datos aleatorios");
			System.out.println("3. Crear clientes");
			System.out.println("4. Ver todos Gestores");
			System.out.println("5. Mostrar notas");
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

				System.out.println("Id del gestor");

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

				Gestor g1 = new Gestor(idNuevo, nombre, numeroTlfn, idOficina);

				listasGestores.put(g1.getId(), g1);

				System.out.println("SE HA CREADO UN NUEVO GESTOR");

				System.out.println("--------------------------------------------");

				break;
			// mostrar info si estudiante es distinto de null
			case 2:

				for(int i = 0; i < 10 ; i++) {
					String nombreLlamado = utiles.nombreAleatorio();
					
					
					
					System.out.println(nombreLlamado);
				
				}
				
				
				
				
				
				break;
			// añadir nota si estudiante es distinto de null
			case 3:

				break;
			// reiniciar notas si estudiante es distinto de null
			case 4:
				if (listasGestores.size() == 0) {

					System.out.println("todavia no ahi gestores");

				}

				listasGestores.forEach((id, gestor) -> {
					gestor.mostrarInfo();

				});
			case 5:
				/*
				 * if (estudiante != null) { estudiante.mostrarNotas(); }
				 */
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
