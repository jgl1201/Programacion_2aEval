package Ejercicios;
// generar el acronimo de una frase
public class Reto06 {
	
	public static String[] splitString (String sentence) {
		return sentence.split(" ");
	}
	
	public static String getAcronym (String[] array) {
		String acronim = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 3 ) acronim += array[i].charAt(0);
		}
		return acronim;
	}
	
	public static void main(String[] args) {
		String sentence = "National Aeronautics and Space Administration";
		String[] array = splitString(sentence);
		
		String acronim = getAcronym(array);
		
		System.out.println(acronim);
	}

}
