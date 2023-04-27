package Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* Generar 5 cartas aleatorias y sumar sus puntos.
 * 
 */
@SuppressWarnings("unchecked")
public class CartasMapas {
	
	static HashMap<String, Integer> points = new HashMap<String, Integer>();
	
	static void setPoints() {
		points.put("AS", 11);
		points.put("DOS", 0);
		points.put("TRES", 10);
		points.put("CUATRO", 0);
		points.put("CINCO", 0);
		points.put("SEIS", 0);
		points.put("SIETE", 0);
		points.put("SOTA", 2);
		points.put("CABALLO", 3);
		points.put("REY", 4);
	}
	
	static ArrayList<Cards> hand = new ArrayList<Cards>();
	
	public static void main(String[] args) {
		setPoints();
		int totalPoints = 0;
		
		do {
			Cards c1 = new Cards();
			if (!hand.contains(c1)) hand.add(c1);
		} while (hand.size() < 5);
		
		Collections.sort(hand);
		System.out.println("Mano ordenada: ");
		for (Cards carta : hand) System.out.println(carta.toString());
		
		for (Cards card : hand) totalPoints += points.get(card.getValue());
		System.out.println("Puntos: " + totalPoints);
	}

}
