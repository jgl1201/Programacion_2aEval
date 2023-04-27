package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo07_GatoTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Ejemplo07_Gato> cats = new ArrayList<Ejemplo07_Gato>();
		cats.add(new Ejemplo07_Gato("Garfield", "naranja", "mestizo"));
		cats.add(new Ejemplo07_Gato("Mauri", "blanco", "manx"));
		cats.add(new Ejemplo07_Gato("Ulises", "marrón", "persa"));
		cats.add(2, new Ejemplo07_Gato());
		
		System.out.println("\n Datos de los gatos: \n");
		for (Ejemplo07_Gato cat : cats) System.out.println(cat + "\n");
		
		for (Ejemplo07_Gato cat : cats) {
			System.out.println(cat.getName());
			System.out.println("Nuevo nombre: ");
			String newName = sc.nextLine();
			cat.setName(newName);
		}
		System.out.println(cats);
		sc.close();
	}

}
