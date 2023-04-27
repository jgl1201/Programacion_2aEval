package Boletin;
// dado el ej5, haz lo mismo pero con arrays de distinta longitud
public class Ej05B {

	public static void main(String[] args) {
		int[] arrayA = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] arrayB = {1, 3, 5, 7};
		int[] mix = new int[(arrayA.length + arrayB.length) - 1];
		
		System.out.print("[ ");
		for (int i = 0; i < mix.length; i++) {
			if (i < arrayA.length)
			System.out.print(arrayA[i] + ", ");
			if (i < arrayB.length)
			System.out.print(arrayB[i] + ", ");
		}
		System.out.println(" ]");
		
	}
	
}
