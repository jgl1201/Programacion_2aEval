package Ejemplos;

public class Ejem02 {

	public static void main(String[] args) {
		byte[] temperatures1 = { 10, 11, 12, 11, 10, 9, 18, 19, 14, 13, 15, 15 };
		System.out.println("Numero de valores: " + temperatures1.length);
		byte[] temperatures2 = temperatures1.clone();
		byte[] temperatures3 = temperatures1;

		System.out.println("Temperaturas 1");
		for (int i = 0; i < temperatures1.length; i++) {
			System.out.print(temperatures1[i] + ", ");
		}
		System.out.println();

		System.out.println("Temperaturas 2");
		for (int i = 0; i < temperatures2.length; i++) {
			System.out.print(temperatures2[i] + ", ");
		}
		System.out.println();

		System.out.println("Temperaturas 3");
		for (int i = 0; i < temperatures3.length; i++) {
			System.out.print(temperatures3[i] + ", ");
		}
		System.out.println();

		if (temperatures1.equals(temperatures2))
			System.out.println("1 y 2 son iguales");
		else
			System.out.println("1 y 2 no son iguales");

		if (temperatures1.equals(temperatures3))
			System.out.println("1 y 3 son iguales");
		else
			System.out.println("1 y 3 no son iguales");
	}

}
