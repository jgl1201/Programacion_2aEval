package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/* Codigo para que se lea desde el teclado una única línea de texto.
Esta debe estar siempre compuesta de números enteros separados entre
sí por comas. El programa debe mostrar por pantalla la suma de todos
los valores individuales.
Por ejemplo, si se escribe "3,8,5,4,11,5", el resultado mostrado
será "36" (3 + 8 + 5 + 4 + 11 + 5)
*/
public class Ejercicio3A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una serie de numeros enteros separados entre si por comas: ");
		String str = sc.nextLine();
		
		String[] numbersStrings = str.split(",");
		System.out.println("Cadena obtenida: ");
		System.out.println(Arrays.toString(numbersStrings));
		
		int[] numbers = new int[numbersStrings.length];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numbersStrings[i].trim());
		}
		System.out.println("Cadena parseada a enteros");
		System.out.println(Arrays.toString(numbers));
		
		int total = 0;
		for (int number : numbers) total+= number;
		System.out.println("Suma de todos los numeros: " + total);
		
		sc.close();
	}

}
