package Ejercicios;

import java.util.Scanner;

public class BuscaCaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una línea de texto cualquiera y pulsa enter: ");
		String text = sc.nextLine();

		System.out.println("¿Qué carácter quieres buscar?");
		String charWanted = sc.next();
		sc.nextLine();
		char charSearch = charWanted.charAt(0);

		int initialPosition = text.indexOf(charSearch);
		int finalPosition = text.lastIndexOf(charSearch);
		int numberRepeted = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(initialPosition)) numberRepeted++;
		}
		
		if (initialPosition > -1) {
			System.out.println("Las apariciones del carácter " + charSearch + " son: " + numberRepeted);
			System.out.println("Primera vez en: " + initialPosition);
			System.out.println("Última vez en: " + finalPosition);
		} else System.out.println("Este carácter no se encuentra en el texto.");
		
		sc.close();
	}

}
