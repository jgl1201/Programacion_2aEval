package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* Programa que introduzca valores aleatorios entre 0 y 100 en ArrayList
 * que calcule la suma, la media, el maximo y el minimo de los valores.
 * El tamaño de la lista puede variar entre 10 y 20 posiciones */
public class Ejercicio02 {
	
	public static int generateNumber() {
		Random r = new Random();
		return r.nextInt(101);
	}
	
	public static int generateSize() {
		Random r = new Random();
		return 10 + r.nextInt(11);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < generateSize(); i++) numbers.add(generateNumber());
		System.out.println("Tamaño: " + numbers.size());
		System.out.println(numbers);
		
		int total = 0;
		for(Integer number: numbers) total += number;
		System.out.println("Suma de los valores generados: " + total);
		System.out.println("La media de los valores es: " + (double) total / numbers.size());
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println("Max: " + Collections.min(numbers));
		System.out.println("Min: " + Collections.max(numbers));
	}
	
}
