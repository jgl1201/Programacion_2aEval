package ArrayList;

import java.util.ArrayList;

public class Ejemplo04 {
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("rojo");
		colors.add("verde");
		colors.add("azul");
		colors.add("blanco");
		colors.add("amarillo");
		
		System.out.println("Contenido de la lista: ");
		for (int i = 0; i < colors.size(); i++)
			System.out.println("Posicion: " + i + "; Valor: " + colors.get(i)); 
	}

}
