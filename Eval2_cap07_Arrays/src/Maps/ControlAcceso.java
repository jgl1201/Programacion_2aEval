package Maps;

import java.util.HashMap;
import java.util.Scanner;

// pedir nombre y password. Si los datos son correctos,
// decir que se ha accedido al area restringida
// 3 oportunidades maximo. Los nombres se acumulan en un hashmap
public class ControlAcceso {

	public static HashMap<String, String> login = new HashMap<String, String>();

	public static void fillMap() {
		login.put("Amalia Nuñez", "1234");
		login.put("Cindy Nero", "1235");
		login.put("Cesar Vazquez", "1236");
		login.put("Victor Tilla", "1237");
		login.put("Alan Brito", "1238");
		login.put("Esteban Quito", "1239");
		login.put("Conchita Perez", "1320");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user, passwd = "";
		int attempts = 3;
		fillMap();
		
		do {
			System.out.println("Usuario: ");
			user = sc.nextLine();
			System.out.println("Password: ");
			passwd = sc.nextLine();

			if (login.containsKey(user) && login.get(user).equals(passwd) ) {
				System.out.println("Has accedido al area restringida");
				attempts = 0;
			} else {
				attempts--;
				System.out.println("Usuario o contraseña incorrectos");
			}
		} while (attempts > 0);

		sc.close();
	}

}
