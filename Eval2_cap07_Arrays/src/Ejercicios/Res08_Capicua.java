package Ejercicios;

import java.util.Scanner;

public class Res08_Capicua {
	
	@SuppressWarnings("removal")
	public static boolean isCap (int date) {
		Integer i = new Integer(date);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString().equals(reverse.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int number = sc.nextInt();
		
		System.out.println(isCap(number));
		
		sc.close();
	}

}
