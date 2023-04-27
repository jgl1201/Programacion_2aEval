package Boletin;

import java.util.Scanner;

/* Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se
encuentra. Si no está, indicarlo con un mensaje. */
public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t[] = new int[10];
		int num, j;
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca numero (orden creciente): ");
			t[i] = sc.nextInt();
		}
		System.out.println();

		System.out.println("Introduzca numero a buscar: ");
		num = sc.nextInt();
		j = 0;
		while (j < 10 && t[j] < num) {
			j++;
		}
		
		if (j == 10)
			System.out.println("No encontrado");
		else {
			if (t[j] == num)
				System.out.println("Encontrado en la posición " + j);
			else
				System.out.println("No encontrado");
		}
		sc.close();
	}
}