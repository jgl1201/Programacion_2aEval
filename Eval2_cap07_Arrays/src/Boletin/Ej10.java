package Boletin;

import java.util.Scanner;

/* Ídem, desplazar N posiciones (N es introducido por el
usuario). */
public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int positions;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca número: ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Posiciones a desplazar:");
		positions = sc.nextInt();

		int copia[] = arr.clone();
		for (int i = 0; i < 10; i++)
			arr[i] = copia[(i + positions) % 10];

		System.out.println("\n\nLa tabla queda:");
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);

		sc.close();
	}

}
