package Ejemplos;

import java.util.Scanner;

public class Ejem03 {
	private static int[] temperatures;
	final static int POSITIONS = 10;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int media = 0;
		temperatures = new int[POSITIONS];

		for (int i = 0; i < POSITIONS; i++) {
			try {
				System.out.println("Introduzca temperatura:");
				String sdata = sc.nextLine();
				data = Integer.parseInt(sdata);
				temperatures[i] = data;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error en la introduccion de datos");
			}
		}

		for (int i = 0; i < POSITIONS; i++) {
			media += temperatures[i];
		}

		media = media / POSITIONS;
		System.out.println("La media es " + media);
		
		sc.close();
	}

}
