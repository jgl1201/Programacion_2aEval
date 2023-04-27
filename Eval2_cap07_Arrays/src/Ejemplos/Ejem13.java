package Ejemplos;

public class Ejem13 {
	
	public static void main(String[] args) {
		// al ser buffer puede cambiar, es modificable
		StringBuffer name = new StringBuffer("Pepe");
		StringBuffer surnames = new StringBuffer(80);
		StringBuffer direction = new StringBuffer();
		
		System.out.println(name.length());
		System.out.println(name.capacity());
		
		StringBuffer name2 = new StringBuffer("Juan Carlos");
		StringBuffer surname2 = new StringBuffer(" Moreno Perez");
		name2.append(surname2);
		System.out.println(name2);
		System.out.println(name2.length());
		System.out.println(name2.capacity());
		
		name2.insert(name.length(), surnames); // inserta esa cadena al final de la original
		System.out.println(name2);
		name2.insert(14, direction); // inserta esa cadena es esa posicion de la original
		System.out.println(name2);
	}

}
