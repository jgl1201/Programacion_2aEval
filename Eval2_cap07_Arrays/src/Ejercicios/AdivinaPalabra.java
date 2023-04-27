package Ejercicios;

import java.util.Scanner;

public class AdivinaPalabra {

	public static final int TRYS = 30;

	public static String generaPalabra(int n) {
		String palabra = "";
		for (int i = 0; i < n; i++) {
			int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
			palabra = palabra + (char) codigoAscii;
		}
		return palabra;
	}

	public static void main(String[] args) {

		int trys = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de letras: ");
		int number = Integer.parseInt(sc.nextLine());

		String secretWord = generaPalabra(number);

		System.out.println("Empecemos el juego");
		System.out.println("Adivina la palabra secreta");
		boolean wordHitted = false;

		while (!wordHitted && trys < TRYS) {
			System.out.println("Te quedan " + (TRYS - trys) + " intentos");
			System.out.println("Qué palabra crees que es?");
			String wordInserted = sc.next();
			sc.nextLine();

			int word = wordInserted.compareTo(secretWord);

			if (word < 0) {
				System.out.println("Has fallado !! Va despues alfabeticamente");
			} else if (word > 0) {
				System.out.println("Has fallado !! Va antes alfabeticamente");
			} else {
				wordHitted = true;
			}
			trys++;
		}

		if (wordHitted) {
			System.out.println("Acertaste !!");
			System.out.println("Necesitaste " + trys + " intentos");
		} else {
			System.out.println("Has usado todos los intentos");
			System.out.println("La palabra era: " + secretWord);
		}
		sc.close();
	}

}
