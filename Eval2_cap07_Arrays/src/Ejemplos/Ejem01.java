package Ejemplos;

import java.util.Scanner;

public class Ejem01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] temperatures; // declarar un array
		int humidities[]; // declarar un array

		temperatures = new byte[10]; // 0 0 0 0 0 0 0 0 0 0

		int capacity = 5;
		humidities = new int[capacity]; // 0 0 0 0 0

		// bucle de recorrido de las posiciones MOSTRAR
		for (int i = 0; i <= temperatures.length - 1; i++) {
			System.out.println("Posición " + i + ": " + temperatures[i]);
		}

		// bucle de recorrido de las posiciones INTRODUCIENDO DATOS
		for (int i = 0; i <= temperatures.length - 1; i++) {
			System.out.println("Introduce temperatura para " + i + ": ");
			temperatures[i] = sc.nextByte();
		}

		// bucle de recorrido de las posiciones MOSTRAR y MEDIA
		int total = 0;
		for (int i = 0; i <= temperatures.length - 1; i++) {
			System.out.println("Posición " + i + ": " + temperatures[i]);
			total += temperatures[i];
		}
		System.out.println("La media de las temperaturas es: " + total / temperatures.length);
		sc.close();
	}

}
