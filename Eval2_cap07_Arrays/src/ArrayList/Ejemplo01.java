package ArrayList;

import java.util.ArrayList;

public class Ejemplo01 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		System.out.println("Nº de elementos: " + colors.size());
		
		colors.add("rojo");
		colors.add("verde");
		colors.add("azul");
		System.out.println("Nº de elementos: " + colors.size());
		colors.add("blanco");
		System.out.println("Nº de elementos: " + colors.size());
		
		System.out.println("El elemento que hay en la posición 0 es " + colors.get(0));
		System.out.println("El elemento que hay en la posición 3 es " + colors.get(3));
		colors.add(2, "amarillo");
		System.out.println(colors.toString());
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		colors.remove("blanco");
		System.out.println(colors.toString());
	}
}