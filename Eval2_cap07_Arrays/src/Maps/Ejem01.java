package Maps;

import java.util.HashMap;
import java.util.Map;

public class Ejem01 {
	
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
		
		//declaramos un mapa
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		//metodo para añadir parejas al map
		m.put(924, "Amalia Núñez");
		m.put(921, "Cindy Nero");
		m.put(700, "César Vázquez");
		m.put(219, "Víctor Tilla");
		m.put(537, "Alan Brito");
		m.put(605, "Esteban Quito ");
		
		System.out.println("Los elementos de m son: \n" + m);
		
		for (Map.Entry pareja : m.entrySet()) {
			System.out.println("Clave: " + pareja.getKey());
			System.out.println("Valor: " + pareja.getValue());
		}
		
		if(m.containsKey(924)) System.out.println(m.get(924));
		if(m.containsKey(924)) System.out.println(m.get(135));	
		
		for (Map.Entry pareja : m.entrySet()) System.out.println(pareja);
		
	}

}
