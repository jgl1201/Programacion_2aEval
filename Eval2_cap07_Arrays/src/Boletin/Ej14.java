package Boletin;

import java.util.Scanner;

/* Leer dos series de 10 enteros, que estarán ordenados
crecientemente. Copiar (fusionar) las dos tablas en una
tercera, de forma que sigan ordenados. */
public class Ej14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], c[];
		int i, j, k;
		a = new int[10];
		b = new int[10];

		System.out.println("Datos para a:");
		for (i = 0; i < 10; i++) {
			System.out.print("Introduzca numero (orden creciente): ");
			a[i] = sc.nextInt();
		}
		System.out.println("\nDatos para b:");
		for (i = 0; i < 10; i++) {
			System.out.print("Introduzca numero (orden creciente): ");
			b[i] = sc.nextInt();
		}
		System.out.println();

		c = new int[20];
		i = 0;
		j = 0;
		k = 0;

		while (i < 10 && j < 10) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		if (i == 10)
			while (j < 10) {
				c[k] = b[j];
				j++;
				k++;
			}
		else
			while (i < 10) {

				c[k] = a[i];
				i++;
				k++;
			}

		System.out.println("Mostramos la tabla c:");
		for (k = 0; k < 20; k++)
			System.out.print(c[k] + " ");

		System.out.println("");
		
		sc.close();
	}
}