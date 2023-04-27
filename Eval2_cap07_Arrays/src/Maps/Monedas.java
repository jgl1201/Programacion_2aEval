package Maps;

import java.util.ArrayList;

/* Generar una moneda aleatoria. La siguiente tiene que
 * tener o el mismo valor o la misma posicion que la anterior
 * Generar 6 monedas aleatorias siguiendo una pauta correcta
 * 2 cents cara ---> 2 euros cara ---> 2 euros cruz ---> 5 cents cruz...
 */
class Coin {
	String value;
	String side;
	
	final static String[] sides = {"cara", "cruz"};
	final static String[] values = {"1 cent", "2 cent", "5 cent", "10 cent", "20 cent", "50 cent", " 1 eur", "2 eur"};
	
	public static String generateSide() {
		int side = (int) (Math.random() * 2);
		return sides[side];
	}
	
	public static String generateValue() {
		int value = (int) (Math.random() * 8);
		return values[value];
	}
	
	Coin(){
		this.value = generateValue();
		this.side = generateSide();
	}
	
	Coin (String value, String side) {
		this.value = value;
		this.side = side;
	}

	public String getValue() {
		return value;
	}
	public String getSide() {
		return side;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + ", side=" + side + "]";
	}
}

public class Monedas {
	
	static ArrayList<Coin> list = new ArrayList<Coin>();
	
	public static void main(String[] args) {
		Coin c1 = new Coin();
		list.add(c1);
		
		do {
			Coin c = new Coin();
			if (c.getSide().equals(c1.getSide()) || c.getValue().equals(c1.getValue())) {
				list.add(c);
				c1 = c;
			}
		} while(list.size() < 6);
		
		for (Coin coin : list) System.out.println(coin.toString());
	}

}
