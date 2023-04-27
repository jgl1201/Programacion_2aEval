package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class LectorFrases {

	public static final int NUM_SENTENCE = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[NUM_SENTENCE];

		System.out.println("Escribe " + NUM_SENTENCE + " frases.");
		System.out.println("Para terminar una frase, pulsa la tecla de retorno.");
		
		for (int i = 0; i < NUM_SENTENCE; i++) {
			String sentence = sc.nextLine();
			System.out.println("Frase " + i + ": Has escrito \" " + sentence);
			array[i] = sentence;
		}
		// Ahora no hay que leer el resto de ninguna línea, ya que siempre se leen
		// líneas enteras ...
		
		System.out.println("Frases escritas: ");
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}

}
