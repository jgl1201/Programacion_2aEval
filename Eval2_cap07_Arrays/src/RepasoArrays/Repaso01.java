package RepasoArrays;

import java.util.Arrays;
import java.util.Random;

// 3 arrays de 20 enteros con nombres numero, cuadrado y cubo.
// Numero: 20 randoms de 0 a 100
// Cuadrado: los cuadrados de esos numeros
// Cubo: los cubos de esos numeros
// Mostar los arrays
// Ordenar los numeros por BURBUJA
public class Repaso01 {

	static int generateNumber() {
		Random r = new Random();
		return r.nextInt(101);
	}

	static void bubbleSort(int[] arr) {
		int aux;
		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[20];
		int[] square = new int[numbers.length];
		int[] cube = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generateNumber();
		}

		for (int i = 0; i < numbers.length; i++) {
			square[i] = (int) Math.pow(numbers[i], 2);
			cube[i] = (int) Math.pow(numbers[i], 3);
		}
		
		bubbleSort(numbers);
		bubbleSort(square);
		bubbleSort(cube);

		System.out.println("Numeros: " + Arrays.toString(numbers));
		System.out.println("Cuadrados: " + Arrays.toString(square));
		System.out.println("Cubos: " + Arrays.toString(cube));
	}

}