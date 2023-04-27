package Boletin;

import java.util.Scanner;

/* Leer por teclado una tabla de 10 elementos numéricos
enteros y una posición (entre 0 y 9). Eliminar el elemento
situado en la posición dada sin dejar huecos. */
public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t[] = new int[10];
		int posicion;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Elemento (" + i + "): ");
			t[i] = sc.nextInt();
		}

		System.out.println();
		
		System.out.print("Posición a eliminar: ");
		posicion = sc.nextInt();

		for (int i = posicion; i < 9; i++)
			t[i] = t[i + 1];
		
		System.out.println("La tabla queda: ");
		for (int i = 0; i < 9; i++)
			System.out.println(t[i]);

		sc.close();
	}

}