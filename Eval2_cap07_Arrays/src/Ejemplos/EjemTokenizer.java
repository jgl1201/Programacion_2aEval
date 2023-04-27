package Ejemplos;

import java.util.StringTokenizer;

public class EjemTokenizer {
	
	public static void main(String[] args) {
		StringTokenizer str;
		str = new StringTokenizer("UNO DOS TRES PERICO JUANICO Y ANDRES");
		System.out.println("La cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}

}
