package Ejercicios;

import java.util.Scanner;

public class InvertOrder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Introduce numero");
		number = sc.nextInt();
		
		String numberText = String.valueOf(number);
		for (int i = numberText.length() - 1; i >= 0; i--)
			System.out.print(numberText.charAt(i));
		
		sc.close();
	}

}
