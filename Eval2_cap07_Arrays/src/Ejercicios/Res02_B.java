package Ejercicios;

import java.util.Arrays;

public class Res02_B {
	
	public static int getRandom() {
		return (int) (Math.random()*100 + 1);
	}
	
	public static void showArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void sort(int[] array) {
		Arrays.sort(array);
	}
	
	public static int[] generateArray() {
		int[] array = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = getRandom();
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] numbers = generateArray();
		showArray(numbers);
		sort(numbers);
		showArray(numbers);
	}

}
