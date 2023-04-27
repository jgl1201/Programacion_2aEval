package Ejercicios;

import java.util.Scanner;

public class Palindromos {
	
	public static String reverseString (String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
	
	public static boolean isPalindrome (String data) {
		String aux = data.toLowerCase().trim();
		aux = reverseString(aux);
		return data.toLowerCase().trim().equals(aux);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce palabra o frase a comprobar: ");
		String text = sc.nextLine();
		
		System.out.println(isPalindrome(text));
		
		sc.close();
	}

}
