package starwars;

import java.util.Objects;
import java.util.Random;

public class Jedi {
	// ATRIBUTOS
	private String nombre;
	private int salud;
	private int fuerza;
	private Random random;
	private String tipoCapa;

	// CONSTRUCTOR
	public Jedi(String nombre, int salud, int fuerza, String tipoCapa) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.random = new Random();
		this.tipoCapa = tipoCapa;
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

	// METODO TOSTRING
	@Override
	public String toString() {
		return "Jedi [nombre=" + nombre + ", salud=" + salud + ", fuerza=" + fuerza + ", tipoCapa=" + tipoCapa + "]";
	}

	// METODO IMPIRMIR
	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Salud: " + this.salud);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Tipo de capa: " + this.tipoCapa);
	}

	// METODO ATACAR
	public void atacar(Sith sith) {
		int danyo = random.nextInt(30, 60);
		System.out.println(this.nombre + " ataca a " + sith.getNombre() + "!");
		sith.recibirAtaque(danyo);
	}

	// METODO RECIBIR ATAQUE
	public void recibirAtaque(int danyo) {
		this.salud -= danyo;
		if (this.salud <= 0) {
			System.out.println(this.nombre + " ha sido derrotado.");
		} else {
			System.out.println(this.nombre + " recibe " + danyo + " puntos de daño. Salud restante: " + this.salud);
		}
	}

	// METODO GRITO GUERRA
	public void gritoGuerra() {
		System.out.println("Que la fuerza te acompañe!!");
	}

}
