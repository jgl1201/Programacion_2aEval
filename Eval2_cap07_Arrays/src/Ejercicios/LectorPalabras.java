package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class LectorPalabras {

	public static final int NUM_WORDS = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[NUM_WORDS];
		
		System.out.println("Escribe " + NUM_WORDS + " palabras separadas por espacios.");
		System.out.println("Las puedes escribir en líneas de texto diferente, si quieres.");
		
		for (int i = 0; i < NUM_WORDS; i++) {
			String word = sc.next();
			System.out.println("Palabra " + i + ": Has escrito " + word);
			array[i] = word;
		}
		
		// Se lee el resto de la línea y se ignora el contenido.
		sc.nextLine();

		System.out.println("Las palbras escritas son: ");
		System.out.println(Arrays.toString(array));

		sc.close();
	}

}
