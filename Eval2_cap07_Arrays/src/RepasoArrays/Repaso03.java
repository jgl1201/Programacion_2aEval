package RepasoArrays;

import java.util.Arrays;
import java.util.Random;

/* Generar 20 enteros aleatorios entre 0 y 100 almacenados en un array
 * Pasar los numeros pares a las primeras posiciones y mostrar los impares despues.
 */
public class Repaso03 {

	static int generateNumber() {
		Random r = new Random();
		return r.nextInt(101);
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[20];
		int odds = 0, evens = 0;
		
		for (int i = 0; i < numbers.length; i++) numbers[i] = generateNumber();
		
		for(int number : numbers) {
			if (number % 2 == 0) evens++;
			else odds++;
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Numero de pares: " + evens);
		System.out.println("Numero de impares: " + odds);
		
		int[] even = new int[evens];
		int[] odd = new int[odds];
		
		int posEven = 0, posOdd = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even[posEven] = numbers[i];
				posEven++;
			}
			else {
				odd[posOdd] = numbers[i];
				posOdd++;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		
		for (int i = 0; i < evens; i++) numbers[i] = even[i];
		for (int i = evens; i < numbers.length; i++) numbers[i] = odd[i - even.length];
		
		System.out.println(Arrays.toString(numbers));
	}
}