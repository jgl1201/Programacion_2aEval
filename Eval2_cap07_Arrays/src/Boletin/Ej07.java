package Boletin;

import java.util.Scanner;

/* Leer por teclado una serie de 10 números enteros. La
aplicación debe indicarnos si los números están ordenados
de forma creciente, decreciente, o si están desordenados. */
public class Ej07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		boolean creciente = false, decreciente = false;

		for (int i = 0; i < 5; i++) {
			System.out.print("Ingresa numero:  ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {

			if (arr[i] < arr[i + 1]) {
				creciente = true;
			}

			if (arr[i] > arr[i + 1]) {
				decreciente = true;
			}
		}

		if (creciente == true && decreciente == false) {
			System.out.println("Creciente");
		}

		else if (creciente == false && decreciente == true) {
			System.out.println("Decreciente");
		} else if (creciente == false && decreciente == false) {
			System.out.println("Todos los numeros son iguales");
		} else {
			System.out.println("Desordenado");
		}
		sc.close();
	}

}
