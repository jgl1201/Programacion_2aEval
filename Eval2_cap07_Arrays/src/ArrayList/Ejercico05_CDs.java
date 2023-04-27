package ArrayList;

import java.util.Scanner;

/* Realizar una coleccion de discos usando una lista para almacenae
 * la informacion sobre ellos. */
public class Ejercico05_CDs {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		final int size = 100;

		Disco[] disks = new Disco[size];

		for (int i = 0; i < size; i++) {
			disks[i] = new Disco();
		}

		disks[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
		disks[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
		disks[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

		int opcion;
		Scanner sc = new Scanner(System.in);
		String code;
		String author;
		String title;
		String gender;
		int length;

		do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");
				for (Disco d : disks)
					if(!d.getCodigo().equals("LIBRE")) System.out.println(d);
			case 2:

			case 3:

			case 4:

			default:
			}
		} while (opcion != 5);

		sc.close();
	}

}
