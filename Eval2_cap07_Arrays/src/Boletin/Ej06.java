package Boletin;

import java.util.Scanner;

/* Leer los datos correspondientes a dos tablas de 12
elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
la B, etc */
public class Ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayA = new int[12];
		int[] arrayB = new int[12];
		int[] mix = new int[(arrayA.length + arrayB.length) - 1];
		
		System.out.println("Numeros del primer array");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Numero: ");
			arrayA[i] = sc.nextInt();
		}
		
		System.out.println("Numeros del segundo array");
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Numero: ");
			arrayB[i] = sc.nextInt();
		}
		
		System.out.print("[ ");
		for (int i = 0; i < mix.length; i++) {
			System.out.print(arrayA[i] + ", ");
			System.out.print(arrayA[i] + ", ");
			System.out.print(arrayA[i] + ", ");
			System.out.print(arrayB[i] + ", ");
			System.out.print(arrayB[i] + ", ");
		}
		System.out.println(" ]");
		
		sc.close();
	}
	
}
