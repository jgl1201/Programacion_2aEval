package Ejercicios;

import java.util.ArrayList;

/*Escriba un programa que cree dos arrayLists de colores, que serán strings:
verde, rojo, azul, etc., ambos de tamaño mayor que cinco y con colores
repetidos entre los dos (no en cada uno).
Con posterioridad dicho programa comparará ambos arrayLists y almacenará
en un tercer arrayList los colores repetidos de ambos
 */
public class Ejercicio5A {
	
	
	
	public static void main(String[] args) {
		ArrayList<String> colors1 = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		
		colors1.add("rojo");
		colors1.add("verde");
		colors1.add("azul");
		colors1.add("blanco");
		colors1.add("amarillo");
		colors1.add("blanco");
		
		colors2.add("rojo");
		colors2.add("morado");
		colors2.add("turquesa");
		colors2.add("magenta");
		colors2.add("naranja");
		colors2.add("blanco");
		colors2.add("verde");
		
		for (String color1 : colors1) {
			for (String color2 : colors2) {
				if (color2.toLowerCase() == color1.toLowerCase())
					System.out.println(color2 + " esta en ambos ArrayList");
			}
		}
		
	}

}
