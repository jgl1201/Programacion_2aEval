package Ejemplos;

public class Ejem10 {
	
	public static void main(String[] args) {
		String str1 = "JUAN SUAREZ";
		System.out.println(str1);
		String str2 = str1.replace('U', 'F');
		System.out.println(str2);
		
		String str3 = "JUAN CARLOS MORENO";
		System.out.println(str3);
		System.out.println(str3.substring(5, 11));
		System.out.println(str3.substring(12));
	}

}
