package Maps;
/* Crear un diccionario espanol-ingles con al menos
 * 20 palabras con traduccion. Pedir una palabra y, si
 * esta en el HashMap, devolver la traduccion.
 * Generar 5 palabras aleatorias, pedir la ttraduccion por teclado
 * y devolver si es correcto o no
 */

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

	static HashMap<String, String> dictionary = new HashMap<String, String>();
	static String[] spanish = { "ordenador", "gato", "rojo", "arbol", "pingüino", "sol", "agua", "viento", "siesta",
			"arriba", "raton", "estadio", "calumnia", "aguacate", "cuerpo", "concurso", "cena", "salida", "lenteja",
			"cacerola", "pastel", "membrillo" };

	static void addWords() {
		dictionary.put("ordenador", "computer");
		dictionary.put("gato", "cat");
		dictionary.put("rojo", "red");
		dictionary.put("arbol", "tree");
		dictionary.put("pingüino", "penguin");
		dictionary.put("sol", "sun");
		dictionary.put("agua", "water");
		dictionary.put("viento", "wind");
		dictionary.put("siesta", "nap");
		dictionary.put("arriba", "up");
		dictionary.put("raton", "mouse");
		dictionary.put("estadio", "arena");
		dictionary.put("calumnia", "aspersion");
		dictionary.put("aguacate", "avocado");
		dictionary.put("cuerpo", "body");
		dictionary.put("concurso", "contest");
		dictionary.put("cena", "dinner");
		dictionary.put("salida", "exit");
		dictionary.put("lenteja", "lentil");
		dictionary.put("cacerola", "pan");
		dictionary.put("pastel", "pie");
		dictionary.put("membrillo", "quince");
	}

	public static void main(String[] args) {
		addWords();
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Palabra en espanol: "); String word = sc.nextLine(); if
		 * (dictionary.containsKey(word)) System.out.println(dictionary.get(word)); else
		 * System.out.println("No hay esa palabra en el diccionario");
		 */
		String pal = "";
		int bien = 0;
		String ent = "";

		for (int i = 5; i < 5; i++) {
			ent = spanish[(int) (Math.random() * 20)];
			System.out.println("Palabra en español: " + ent);
			pal = sc.nextLine();

			if (pal.equals(dictionary.get(ent)))
				bien++;
		}
		System.out.println("Has  acertado: " + bien);

		/*
		 * System.out.println("Palabras en español: "); pal=sc.nextLine();
		 * 
		 * if(dic.containsKey(pal)) { System.out.println("Traducción:" + dic.get(pal));
		 * }else System.out.println("La palabra no está en el diccionario.:(");
		 */
		sc.close();
	}

}
