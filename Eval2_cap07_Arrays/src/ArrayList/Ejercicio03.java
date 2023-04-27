package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Programa que ordene 10 numeros enteros introducidos por teclado
public class Ejercicio03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Numero: ");
			numbers.add(sc.nextInt());
		}
		
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		sc.close();
	}

}
