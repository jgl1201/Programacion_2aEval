package Boletin;

import java.util.Scanner;

/* Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc. */
public class Ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("[ ");
		for(int i = 0; i < ((array.length) / 2); i++) {
			System.out.print(array[i] + ", ");
			System.out.print(array[(array.length - 1) - i] + ", ");
		}
		System.out.println(" ]");
		
		sc.close();
	}

}
