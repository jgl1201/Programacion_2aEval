package Ejercicios;

import java.util.Scanner;

/* haga un programa que muestre por pantalla cada una de las
palabras individuales de una frase en líneas diferentes. Para ello,
antes deberá ir averiguando las posiciones donde hay espacios en
blanco para poder delimitar dónde empieza y termina cada palabra. */
public class Reto05 {

	public static void main(String[] args) {
		// while haya espacios en blanco, trocea
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase de texto y pulsa enter");
		String text = sc.nextLine();
		
		System.out.println("Las palabras son: ");
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') System.out.println();
			else System.out.print(text.charAt(i));
		}
		
		sc.close();
	}
	
}
