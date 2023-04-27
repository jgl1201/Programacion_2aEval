package ArrayList;

public class Ejemplo07_Gato implements Comparable<Ejemplo07_Gato> {
	private String name;
	private String color;
	private String race;
	
	public Ejemplo07_Gato() {
		name = "Anonimo";
		color = "";
		race = "";
	}

	public Ejemplo07_Gato(String nombre, String color, String raza) {
		this.name = nombre;
		this.color = color;
		this.race = raza;
	}

	public String getName() {
		return name;
	}

	public String getRace() {
		return race;
	}
	
	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String toString() {
		return "Nombre: " + this.name + "\nColor: " + this.color + "\nRaza: " + this.race;
	}

	public int compareTo(Ejemplo07_Gato cat) {
		return (this.name).compareTo(cat.getName());
	}

	public boolean equals(Ejemplo07_Gato cat) {

		return (this.name).equals(cat.getName());
	}
}