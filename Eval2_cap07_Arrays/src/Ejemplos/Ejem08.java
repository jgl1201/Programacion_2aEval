package Ejemplos;
// diferencia de equals e ==
public class Ejem08 {
	
	public static void main(String[] args) {
		String str1 = "EMMA";
		String str2 = new String("EMMA");
		
		// EQULAS
		if (str1.equals(str2)) System.out.println("Son iguales");
		else System.out.println("No son iguales");
		
		// ==
		if (str1 == str2) System.out.println("Son iguales");
		else System.out.println("No son iguales");
	}

}
