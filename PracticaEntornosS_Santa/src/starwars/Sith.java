package starwars;

import java.util.Objects;
import java.util.Random;

public class Sith {

	// ATRIBUTOS
	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;

	// CONSTRUCTOR
	public Sith(String nombre, int salud, int fuerza, Random random) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.random = random;
	}

	// CREO GETTER AND SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

}
