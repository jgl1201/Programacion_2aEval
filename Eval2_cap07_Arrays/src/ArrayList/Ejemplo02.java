package ArrayList;

import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(18);
		numbers.add(20);
		numbers.add(-30);
		System.out.println("Nº de elementos: " + numbers.size());
		System.out.println("El elemento en la posicion 1 es: " + numbers.get(1));

		System.out.println(numbers);

		System.out.println("Cuidado con los set");
		numbers.set(1, 56);
		System.out.println(numbers);

		int i = 0;
		for (Integer number : numbers) {
			// Integer manipulableNumber = new Integer(0);
			// manipulableNumber = numbers.get(i);
			System.out.println("Posicion: " + i + "; Valor: " + number);
			System.out.println("Nuevo valor:");
			number = sc.nextInt();
			numbers.set(i, number);
			i++;
		}
		System.out.println(numbers);

		sc.close();
	}

}
