package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionPersonal {

	static HashMap<Integer, String> gestion = new HashMap<Integer, String>();

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		boolean keep = true;

		do {
			System.out.println("Gestion de Personal");
			System.out.println("---------------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1- Listar");
			System.out.println("2- Añadir");
			System.out.println("3- Modificar");
			System.out.println("4- Eliminar");
			System.out.println("5- Salir");
			option = Integer.parseInt(sc.nextLine());

			switch (option) {
			case(1):
				for (Map.Entry pair : gestion.entrySet()) System.out.println(pair);
				break;
			case(2):
				System.out.println("Clave: ");
				int key = Integer.parseInt(sc.nextLine());
				System.out.println("Valor: ");
				String value = sc.nextLine();
				if(!gestion.containsKey(key)) gestion.put(key, value);
				else System.out.println("Ya existe esa clave");
				break;
			case(3):
				System.out.println("Clave a modificar: ");
				int modKey = Integer.parseInt(sc.nextLine());
				if (gestion.containsKey(modKey)) {
					System.out.println("Valor actual: " + gestion.get(modKey));
					System.out.println("Nuevo valor: ");
					String newValue = sc.nextLine();
					gestion.put(modKey, newValue);
				} else System.out.println("Esa clave no existe");
				break;
			case(4):
				System.out.println("Clave a eliminar: ");
				int deleteKey = Integer.parseInt(sc.nextLine());
				if(gestion.containsKey(deleteKey)) gestion.remove(deleteKey);
				else System.out.println("No existe esa clave");
				break;
			case(5):
				keep = false;
				System.out.println("Saliendo");
				break;
			}
		} while (keep);

		sc.close();
	}

}
