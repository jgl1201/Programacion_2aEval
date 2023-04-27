package RepasoArrays;

import java.util.Arrays;
import java.util.Scanner;

/* Leer 15 numeros por teclado y almacenarlos en un array.
 * Rotar las posiciones DCHA (0->1; 1->2...) La ultima posicon pasa a ser la 0
 * el numero de veces pedido por teclado
 * Mostrar el array
 */
public class Repaso02 {

	@SuppressWarnings("resource")
	static int[] getNumbers(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Posicion " + i + ": ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	static int[] rotateArray(int[] arr) {
		int aux = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = aux;
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRotations;
		int[] array = new int[15];
		getNumbers(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Cuantas veces quieres rotar las posiciones? ");
		numRotations = sc.nextInt();
		
		for (int i = 0; i < numRotations; i++) rotateArray(array);
		System.out.println(Arrays.toString(array));
		
		sc.close();
	}
	
}
