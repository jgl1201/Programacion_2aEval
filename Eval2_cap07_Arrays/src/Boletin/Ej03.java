package Boletin;

import java.util.Scanner;

/* Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros. */
public class Ej03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int zeros = 0, pos = 0, medPos = 0, neg = 0, medNeg = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Numero: ");
			array[i] = sc.nextInt();
			if (array[i] == 0) zeros++;
			if (array[i] % 2 == 0) {
				pos += array[i];
				medPos++;
			}
			if (array[i] % 2 != 0) {
				neg += array[i];
				medNeg++;
			}
		}

		System.out.println("Ceros: " + zeros);
		System.out.println("Media positivos: " + (pos / medPos));
		System.out.println("Media positivos: " + (neg / medNeg));
		
		sc.close();
	}

}
