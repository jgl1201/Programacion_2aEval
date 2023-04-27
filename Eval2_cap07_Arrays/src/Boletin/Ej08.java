package Boletin;

import java.util.Scanner;

/* Diseñar una aplicación que declare una tabla de 10
elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo
en la posición indicada, desplazando los que estén detrás. */
public class Ej08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int number, index;

		for (int i = 0; i < 8; i++) {
			System.out.print("Introduzca número: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Nuevo numero: ");
		number = sc.nextInt();
		System.out.print("Indice donde insertar (de 0 a 8): ");
		index = sc.nextInt();

		for (int i = 7; i >= index; i--)
			arr[i + 1] = arr[i];
		arr[index] = number;

		System.out.println("La tabla queda:");
		for (int i = 0; i < 9; i++)
			System.out.println(arr[i]);

		sc.close();
	}
}
