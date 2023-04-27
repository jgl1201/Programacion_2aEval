package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] galProvinces = {"A Coruña", "Lugo", "Ourense", "Pontevedra"};
		ArrayList<String> provinces = new ArrayList<String>(Arrays.asList(galProvinces));
		System.out.println(provinces);
		
		int i = 0;
		for (String province : provinces) {
			System.out.println("Posicion: " + i + "; Valor: " + province);
			i++;
		}
		
		int j = 0;
		for (String province : provinces) {
			System.out.println("Posicion: " + j + "; Valor: " + province);
			System.out.println("Nuevo valor: ");
			province = sc.nextLine();
			provinces.set(j, province);
			j++;
		}
		System.out.println(provinces);
		
		sc.close();
	}

}
