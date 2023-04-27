package Boletin;

import java.util.Arrays;
import java.util.Scanner;
/* 1. Leer 5 números y mostrarlos en el mismo orden
introducido. */
public class Ej01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}

}
