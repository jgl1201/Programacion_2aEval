package Maps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

@SuppressWarnings("rawtypes")
class Cards implements Comparable{
	
	String value;
	String palo;
	
	final static String[] values = {"AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
	final static String[] palos = {"COPAS", "OROS", "ESPADAS", "BASTOS"};
	
	
	public static String generateValue() {
		int val = (int) (Math.random() * 10);
		return values[val];
	}
	
	public static String generatePalo() {
		int val = (int) (Math.random() * 4);
		return palos[val];
	}
	
	Cards() {
		this.value = generateValue();
		this.palo = generatePalo();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Cards [value=" + value + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(palo, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		return Objects.equals(palo, other.palo) && Objects.equals(value, other.value);
	}	

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		// primero por palo
		Cards car = (Cards) obj;

		//si son palos distintos ordena por palo
		if (!this.getPalo().equals(car.getPalo()))
			return this.getPalo().compareTo(car.getPalo());
		//si son del mismo palo ordena por valor
		else
			return this.getValue().compareTo(car.getValue());

	}
}


/* Generar 5 cartas aleatorias.
 * Emplea un Arraylist
 */
@SuppressWarnings("unchecked")
public class Cartas {
	
	static ArrayList<Cards> list = new ArrayList<Cards>();
	
	public static void main(String[] args) {
		Cards c = new Cards();
		list.add(c);
		
		do {
			Cards c1 = new Cards();
			if (!list.contains(c1)) list.add(c1);
			
		} while (list.size() < 5);
		
		System.out.println("Mano desordenada: ");
		for (Cards carta : list) System.out.println(carta.toString());
		Collections.sort(list);
		System.out.println("Mano ordenada: ");
		for (Cards carta : list) System.out.println(carta.toString());
	}

}
