package Boletin;

import java.util.Scanner;

/* Leer 10 enteros. Guardar en otra tabla los elementos
pares de la primera, y a continuación los elementos
impares. Realizar dos versiones: una trabajando con los
valores y otra trabajando con los índices. */
public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		int countEven, even[];
		int countOdd, odd[];
		arr = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca un número: ");
			arr[i] = sc.nextInt();
		}

		countEven = 0;
		countOdd = 0;
		for (int i = 0; i < 10; i++)
			if (arr[i] % 2 == 0)
				countEven++;
			else
				countOdd++;
		even = new int[countEven];
		odd = new int[countOdd];
		countEven = 0;
		countOdd = 0;
		for (int i = 0; i < 10; i++)

			if (arr[i] % 2 == 0) {
				even[countEven] = arr[i];
				countEven++;
			} else {
				odd[countOdd] = arr[i];
				countOdd++;
			}
		System.out.println("\n\nTabla par:");
		for (int i = 0; i < countEven; i++)
			System.out.println(even[i]);
		System.out.println("Tabla impar:");
		for (int i = 0; i < countOdd; i++)
			System.out.println(odd[i]);

		sc.close();
	}

}
