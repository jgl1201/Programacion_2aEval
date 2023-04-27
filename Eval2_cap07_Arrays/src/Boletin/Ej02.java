package Boletin;

import java.util.Scanner;

/* Leer 5 números y mostrarlos en orden inverso al
introducido. */
public class Ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero: ");
			array[i] = sc.nextInt();
		}

		System.out.println("Array invertido: ");
		System.out.print("[ ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ]");

		sc.close();
	}

}
