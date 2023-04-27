package Boletin;

import java.util.Scanner;

/* Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1o de A, el 1o de
B, el 2o de A, el 2o de B, etc. */
public class Ej05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
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
			System.out.print(arrayB[i] + ", ");
		}
		System.out.println(" ]");
		
		sc.close();
	}
	
}
