package ArrayList;

import java.util.ArrayList;

public class Ejemplo05 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("rojo");
		colors.add("verde");
		colors.add("azul");
		colors.add("blanco");
		colors.add("amarillo");
		colors.add("blanco");
		
		System.out.println("Contenido de la lista: ");
		for (String color : colors) System.out.println(color);
		
		System.out.println();
		
		if (colors.contains("blanco")) {
			System.out.println("El blanco está en la lista de colores");
		}
		
		colors.remove("blanco");
		
		System.out.println("Contenido de la lista después de quitar la " + "primera ocurrencia del color blanco: ");
		for (String color : colors) System.out.println(color);
		
		System.out.println();
		
		colors.remove(2);
		
		System.out.println("Contenido de la lista después de quitar el " + "elemento de la posición 2: ");
		for (String color : colors) System.out.println(color);
	}

}
