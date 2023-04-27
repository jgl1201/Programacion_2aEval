package Ejemplos;

import java.util.Arrays;

public class Ejem09 {
	
	public static void main(String[] args) {
		String str1 = "                  MAYKA ES la novia de Lima";
		System.out.println(str1.trim());
		
		String str2 = "PEDRO lambebixo";
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		String str3 = "hola mundo";
		char[] arr = str3.toCharArray();
		System.out.println(Arrays.toString(arr));
	}

}
