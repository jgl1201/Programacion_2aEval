 package Ejercicios;

import java.util.Arrays;

public class Res02_ArrayRandoms {

	private static int[] list;
	final static int POS = 50;
	final static int LIMIT = 100;
	
	public static int getRandom() {
		return (int) (Math.random()*LIMIT + 1);
	}
	
	public static void showArray() {
		System.out.print("[ ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.print(" ]");
	}
	
	public static void sort() {
		Arrays.sort(list);
	}
	
	public static void toList() {
		Arrays.toString(list);
	}
	
	public static void generateArray() {
		for (int i = 0; i < list.length; i++) {
			list[i] = getRandom();
		}
	}
	
	public static void main(String[] args) {
		list = new int[POS];
		for (int i = 0; i < list.length; i++) {
			list[i] = getRandom();
		}
		showArray();
		System.out.println();
		sort();
		showArray();
	}
	
}
