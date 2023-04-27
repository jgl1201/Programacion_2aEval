package Ejemplos;

public class Ejem05 {
	
	public static void main(String[] args) {
		String str1 = "pepe";
		String str2 = new String("lionel");
		String str3 = new String(str2);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str2.equals(str3));
		
		String str4 = "Andy";
		System.out.println(str4.concat(" y Lukas"));
	}

}
