package Ejercicios;

import java.util.Arrays;

// ordenar un array de cadenas usando el metodo compareTo()
public class Reto04 {

	public static String[] stringArraySort(String[] words) {
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		return words;
	}

	public static void main(String[] args) {
		String[] array = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
		System.out.println(Arrays.toString(array));
		String[] sorted = stringArraySort(array);
		System.out.println(Arrays.toString(sorted));
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
	}

}
