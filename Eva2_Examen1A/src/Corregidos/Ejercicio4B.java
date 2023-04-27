package Corregidos;

import java.util.Arrays;
import java.util.Scanner;

// Ingresas al menos ocho palabras y poner las tres que mas veces han aparecido
public class Ejercicio4B {
	
	public static void main(String[] args) {
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) alphabet[i] = (char)('a' + i);
		Scanner sc = new Scanner(System.in);
		int[] ocurrences = new int[26];
		int numberWords = 0;
		boolean keep = true;
		
		System.out.println("Introduzca palabras (minimo 8): ");
		String text = sc.nextLine();
		do {
			String[] words = text.split(" ");
			numberWords = words.length;
			if(numberWords >= 8) keep = false;
			else {
				System.out.println("Incorrecto");
				System.out.println("Introduce palabras: ");
				text = sc.nextLine();
			}
		
		} while (keep);
		
		System.out.println(text);
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == alphabet[i]) ocurrences[i]++;
			}
		}
		
		System.out.println(Arrays.toString(alphabet));
		System.out.println(Arrays.toString(ocurrences));
		
		sc.close();
	}

}
