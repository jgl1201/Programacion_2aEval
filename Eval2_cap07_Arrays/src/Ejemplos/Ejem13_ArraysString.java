package Ejemplos;

import java.util.Scanner;

public class Ejem13_ArraysString {
	
	private static String[] list;
	final static int POS = 10;
	
	public static void show() {
		for (int i = 0; i < POS; i++) System.out.print(list[i] + " ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new String[POS];
		
		for (int i = 0; i < POS; i++) {
			System.out.println("Valor: ");
			String ln = sc.nextLine();
			list[i] = ln.toString();
		}
		System.out.println();
		show();
		
		sc.close();
	}

}
