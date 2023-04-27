package Ejemplos;

public class Ejem11 {
	
	public static void main(String[] args) {
		String str1 = "AMPARO HEREDIA";
		System.out.println(str1.charAt(0) + " " + str1.charAt(7));
		
		String str2 = "EMMA MORENO";
		System.out.println(str2.indexOf('M'));
		System.out.println(str2.indexOf('J'));
		
		String str3 = "18";
		int number = Integer.parseInt(str3);
		System.out.println(number);
		
		String str4 = "      6     ";
		System.out.println(Integer.parseInt(str4.trim()));
		
		String str5 = "    6.8    ";
		System.out.println(Double.parseDouble(str5.trim()));
		
		int age1 = 16;
		String str6 = String.valueOf(age1);
		System.out.println(str6);
	}

}
