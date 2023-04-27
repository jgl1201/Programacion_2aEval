package Corregidos;

import java.util.Arrays;
import java.util.Random;

/* Generar 20 números enteros entre 100 y 200 almacenarlos en un ARRAY
Listar por pantalla en qué posiciones se encuentran los números
terminados en 2. */
public class Ejercicio1A {
	
	public static int generateNumber() {
		Random r = new Random();
		return 100 + r.nextInt(101);
	}
	
	public static int getLastDigit(int number) {
		return number % 10;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[20];
		
		for (int i = 0; i < numbers.length; i++) numbers[i] = generateNumber();
		
		System.out.println("Array generado: ");
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Numeros del array que acaban en 2: ");
		for (int i = 0; i < numbers.length; i++) {
			if(getLastDigit(numbers[i]) == 2) System.out.println("Posicion: " + i + "; Numero: " + numbers[i]);
		}
	}

}
