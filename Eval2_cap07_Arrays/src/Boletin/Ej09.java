package Boletin;
/* Crear un programa que lea por teclado una tabla de 10
números enteros y la desplace una posición hacia abajo: el
primero pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente. El último pasa a ser el
primero. */

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int last;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca número: ");
			arr[i] = sc.nextInt();
		}

		last = arr[arr.length - 1];

		for (int i = (arr.length - 2); i >= 0; i--)
			arr[i + 1] = arr[i];
	
		arr[0] = last;

		System.out.println("La tabla queda:");
		for (int i = 0; i < 10; i++)
			System.out.println(arr[i]);

		sc.close();
	}
}