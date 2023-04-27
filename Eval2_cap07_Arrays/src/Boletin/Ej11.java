package Boletin;

import java.util.Scanner;

/* Leer 5 elementos numéricos que se introducirán
ordenados de forma creciente. Éstos los guardaremos en una
tabla de tamaño 10. Leer un número N, e insertarlo en el
lugar adecuado para que la tabla continúe ordenada. */
public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int number, position, j;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduzca número (ordenado crecientemente): ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("Número a insertar entre los anteriores: ");
		number = sc.nextInt();

		position = 0;
		j = 0;
		
		while (arr[j] < number && j <= 4) {
			position++;
			j++;
		}

		for (int i = 4; i >= position; i--)
			arr[i + 1] = arr[i];
		
		arr[position] = number;
		System.out.println("La nueva serie ordenada queda: ");
		for (int i = 0; i < arr.length + 1; i++)
			System.out.println(arr[i]);

		sc.close();
	}
}
