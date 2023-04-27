package Ejercicios;

import java.util.Scanner;

// pedir dos cadenas
// devolver en mayusculas las partes de la primera que coincidan con la segunda
public class Examen4A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Frase 1:");
		String str1 = sc.nextLine();
		System.out.println("Frase 2:");
		String str2 = sc.nextLine();
		
		String[] sentence1 = str1.toLowerCase().split(" ");
		
		for (String part : sentence1) {
			if (part.equals(str2.toLowerCase())) part = part.toUpperCase();
			System.out.println(part);
		}
		
		sc.close();
	}

}
