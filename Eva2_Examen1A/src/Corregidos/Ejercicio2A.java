package Corregidos;

import java.util.Arrays;
import java.util.Scanner;
import Sorts.AllSorts;

/* Pedir por teclado dos series de 5 enteros. Posteriormente se
ordenarán decrecientemente por el método de la burbuja. Por último
se fusionaran las dos tablas en una tercera, de forma que sigan
ordenados de forma decreciente. */

public class Ejercicio2A {

	public static int[] fusionArrays(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		for (int k = 0; k < arr.length; k++) {
			if (i < arr1.length && j < arr2.length) {
				if (arr1[i] >= arr2[j]) {
					arr[k] = arr1[i];
					i++;
					if (i == arr1.length) k++;

				} else {
					arr[k] = arr2[j];
					j++;
					if (j == arr2.length) k++;
				}
			}
			if (i < arr1.length && j >= arr2.length) {
				arr[k] = arr1[i];
				i++;
			}
			if (j < arr2.length && i >= arr1.length) {
				arr[k] = arr2[j];
				j++;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers1 = new int[5];
		int[] numbers2 = new int[5];

		System.out.println("Primer array: ");
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println("Numero para la posicion " + i + ": ");
			numbers1[i] = sc.nextInt();
		}
		System.out.println("--------------------");
		System.out.println("Segundo array: ");
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println("Numero para la posicion " + i + ": ");
			numbers2[i] = sc.nextInt();
		}

		System.out.println("Array 1: ");
		System.out.println(Arrays.toString(numbers1));
		System.out.println("Array 2: ");
		System.out.println(Arrays.toString(numbers2));
		AllSorts.bubbleSortInverted(numbers1);
		AllSorts.bubbleSortInverted(numbers2);
		System.out.println("Array 1: ");
		System.out.println(Arrays.toString(numbers1));
		System.out.println("Array 2: ");
		System.out.println(Arrays.toString(numbers2));

		int[] allNumbers = new int[numbers1.length + numbers2.length];
		for (int i = 0; i < numbers1.length; i++)
			allNumbers[i] = numbers1[i];
		for (int i = numbers1.length; i < allNumbers.length; i++)
			allNumbers[i] = numbers2[i - numbers1.length];
		AllSorts.bubbleSortInverted(allNumbers);
		System.out.println("Array final: ");
		System.out.println(Arrays.toString(allNumbers));

		sc.close();
	}

}
