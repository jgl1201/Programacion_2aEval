package Ejercicios;

import java.util.Scanner;

/* Ingrese un texto de al menos 8 palabras e indique qué letras no han
aparecido en el texto. */

public class Ejercicio4A {
	
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un texto: ");
		String text = sc.nextLine();
		
		String[] wordsAtText = text.split(" ");
		if (wordsAtText.length < 8) System.out.println("Texto con menos de 8 palabras. Reiniciar programa");
		else {
			text.toLowerCase();
			char[] letters = text.toCharArray();
			String alph = "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
			char[] alphC = alph.toCharArray();
			for (char letter : letters) {
				if (Character.isAlphabetic(letter)) {
					for (char l : alphC) {
						if (letter == l) ;
						else System.out.println(l);
					}
				}
			}
		}
		
		sc.close();
	}

}
