package Ejercicios;

import java.util.Scanner;

public class ExtraerPalabra {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase de texto y pulsa enter");
		String text = sc.nextLine();
		System.out.println(text);
		
		// Busca primer y ultimo espacio en blanco
		int initSubstring = text.indexOf(' ');
		int endSubstring = text.lastIndexOf(' ');
		System.out.println("El texto sin la primera ni la ultima palabra es: ");
		
		if (initSubstring == endSubstring) System.out.println("No hay nada que escribir");
		else System.out.println(text.substring(initSubstring + 1, endSubstring));
		
		
		sc.close();
	}

}
